package datasource.dao.mysqldao;

import datasource.ConnectionPool;
import datasource.dao.DaoFactory;
import datasource.dao.MealDao;
import datasource.dao.OrderDao;
import datasource.dao.UserDao;

import java.sql.Connection;

public class JDBCDaoFactory extends DaoFactory {

    @Override
    public UserDao createUserDao() throws Exception {
        return new JDBCUserDAO(getConnection());
    }

    @Override
    public MealDao createMealDao() throws Exception {
        return new JDBCMealDAO(getConnection());
    }

    @Override
    public OrderDao createOrderDao() throws Exception {
        return new JDBCOrderDAO(getConnection());
    }
}
