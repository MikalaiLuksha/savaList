package by.pelar.service;

import by.pelar.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private List<User> userList;


    public void saveUser(User user){
        userList.add(user);
    }

    public User checkAuth (User user){
        for (User user1: userList) {
            if (user1.getLogin().equals(user.getLogin())
                    &
                    user1.getPassword().equals(user.getPassword())
            ){
                return user1;
            }

        }
        return null;
    }

}
