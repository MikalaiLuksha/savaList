package by.pelar.service;

import by.pelar.entity.User;
import by.pelar.storage.UserStorage;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserStorage userStorage;

    public UserService(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void saveUser(User user){
        userStorage.addUser(user);
    }

    public User checkAuth (User user){
        return user;
    }

}
