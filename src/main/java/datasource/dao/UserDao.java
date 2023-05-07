package datasource.dao;

import datasource.entities.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao extends AutoCloseable {
    User getUserById(int id) throws SQLException;
    User getUserByEmail(String email) throws SQLException;
    int addUser(User user) throws SQLException;
    void updateUser(User user) throws SQLException;
    void deleteUser(int id) throws SQLException;
}
