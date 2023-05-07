import datasource.ConnectionPool;
import datasource.dao.DaoFactory;
import datasource.dao.MealDao;
import datasource.dao.OrderDao;
import datasource.dao.UserDao;
import datasource.entities.*;

import java.math.BigDecimal;
import java.util.List;

public class RestaurantMain {

    public static void main(String[] args) {
        try (MealDao mealDao = DaoFactory.getInstance().createMealDao();
                UserDao userDao = DaoFactory.getInstance().createUserDao();
                OrderDao orderDao = DaoFactory.getInstance().createOrderDao()) {

            User admin = new User("admin@gmail.com", "pass", (short)UserRole.ADMINISTRATOR.getCode());
            User customer = new User("customer@gmail.com", "password", (short)UserRole.CUSTOMER.getCode());
            int adminId = userDao.addUser(admin);
            int customerId = userDao.addUser(customer);

            Meal pasta = new Meal("pasta", BigDecimal.TEN);
            Meal bread = new Meal("bread", BigDecimal.ONE);
            int pastaId = mealDao.addMeal(pasta);
            int breadId = mealDao.addMeal(bread);

            Order order1 = new Order(pastaId, customerId, OrderStatus.PREPARING.getCode(), 1);
            Order order2 = new Order(breadId, customerId, OrderStatus.PREPARING.getCode(), 2);
            int pastaOrderId = orderDao.addOrder(order1);
            int breadOrderId = orderDao.addOrder(order2);

            System.out.println(customerId + " " + userDao.getUserById(customerId));
            System.out.println(breadId + " " +mealDao.getMealById(breadId));
            System.out.println(pastaOrderId + " " + orderDao.getOrderById(pastaOrderId));

            List<Meal> meals = mealDao.getAllMeals();
            for(Meal m : meals) {
                System.out.println(m);
            }

            List<Order> orders = orderDao.getAllOrders();
            for(Order o : orders) {
                System.out.println(o);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            ConnectionPool.getInstance().closeAllConnections();
        }
    }
}
