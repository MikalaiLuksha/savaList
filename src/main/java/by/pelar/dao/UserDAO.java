package by.pelar.dao;

import by.pelar.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

private JdbcTemplate jdbcTemplate;

    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

private final static String SAVE_USER = "insert into userdata (name, login, password) values (?, ?, ?)";

    public void saveUser(User user){
        jdbcTemplate.update(SAVE_USER, user.getName(), user.getLogin(), user.getPassword());
    }


}
