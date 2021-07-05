package by.pelar.storage;

import by.pelar.entity.User;
import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class UserStorage {

    private Connection connection = null;

    private final static String URL_TABLES = "jdbc:postgresql://localhost:5432/savaList";
    private final static String LOGIN_TABLES = "postgres";
    private final static String PASS_TABLES = "1987Roll";

    private final static String ADD_USER = "insert into userdata (id, name, login, password, role) values (default , ?, ?, ?, ?)";
    private final static String GET_USER_BY_LOGIN = "select * from userdata s where s.login = ?";
    private final static String GET_ALL_USER = "select * from userdata";

//    static {
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    public void addUser(User user) {
        try {
            connection = DriverManager.getConnection(URL_TABLES, LOGIN_TABLES, PASS_TABLES);
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_USER);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getRole().toString());
            preparedStatement.execute();
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

//    public User getUserByLogin(String login) {
//        try {
//            connection = DriverManager.getConnection(URL_TABLES, LOGIN_TABLES, PASS_TABLES);
//            PreparedStatement preparedStatement = connection.prepareStatement(GET_USER_BY_LOGIN);
//            preparedStatement.setString(1, login);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            resultSet.next();
//            long id = resultSet.getLong(1);
//            String firstName = resultSet.getString(2);
//            String lastName = resultSet.getString(3);
//            String password = resultSet.getString(5);
//            String role = resultSet.getString(6);
//            connection.close();
//            return new User(id, firstName, lastName, login, password, role);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
