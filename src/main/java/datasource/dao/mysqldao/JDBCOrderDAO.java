package datasource.dao.mysqldao;

import datasource.ConnectionPool;
import datasource.dao.OrderDao;
import datasource.entities.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCOrderDAO implements OrderDao {

    private static final String QUERY_SELECT_ALL = "SELECT * FROM orders";
    private static final String QUERY_SELECT_BY_ID = "SELECT * FROM orders WHERE id = ?";
    private static final String QUERY_SELECT_BY_CUSTOMER_ID = "SELECT * FROM orders WHERE customer_id = ?";
    private static final String QUERY_INSERT =  "INSERT INTO orders (meal_id, customer_id, quantity, status) VALUES (?, ?, ?, ?)";
    private static final String QUERY_UPDATE = "UPDATE orders SET  status = ? WHERE id = ?";
    private static final String QUERY_DELETE = "DELETE FROM orders WHERE id = ?";
    private final Connection conn;

    public JDBCOrderDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Order> getAllOrders() throws SQLException {
        List<Order> orders = new ArrayList<>();

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY_SELECT_ALL)) {
            while (rs.next()) {
                orders.add(extractOrderFromResult(rs));
            }
        }
        return orders;
    }

    @Override
    public Order getOrderById(int id) throws SQLException {
        Order order = null;

        try (PreparedStatement stmt = conn.prepareStatement(QUERY_SELECT_BY_ID)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    order = extractOrderFromResult(rs);
                }
            }
        }
        return order;
    }

    @Override
    public List<Order> getOrdersByClientId(int customerId) throws SQLException {
        List<Order> orders = new ArrayList<Order>();

        try (PreparedStatement stmt = conn.prepareStatement(QUERY_SELECT_BY_CUSTOMER_ID)) {
            stmt.setInt(1, customerId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    orders.add(extractOrderFromResult(rs));
                }
            }
        }
        return orders;
    }

    @Override
    public int addOrder(Order order) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(QUERY_INSERT, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, order.getMealId());
            stmt.setInt(2, order.getCustomerId());
            stmt.setInt(3, order.getQuantity());
            stmt.setInt(4, order.getStatus());
            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return -1;
    }

    @Override
    public void updateOrder(Order order) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(QUERY_UPDATE)) {
            stmt.setInt(1, order.getStatus());
            stmt.setInt(2, order.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void deleteOrder(int id) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement(QUERY_DELETE)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    private Order extractOrderFromResult(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        int clientId = rs.getInt("customer_id");
        int mealId = rs.getInt("meal_id");
        int status = rs.getInt("status");
        int quantity = rs.getInt("quantity");
        Timestamp creationDate = rs.getTimestamp("creation_date");

        return new Order(id, mealId, clientId, status, quantity, creationDate);
    }

    @Override
    public void close() throws Exception {
        ConnectionPool.getInstance().returnConnection(conn);
    }
}
