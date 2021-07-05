package by.pelar.controller;


import by.pelar.entity.User;
import by.pelar.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/reg")
    public String reg (Model model){
        model.addAttribute("user", new User());
        return "reg";
    }


    @PostMapping(path = "/reg")
    public String reg (User user){
        userService.saveUser(user);
        return "index";
    }

    public String auth(User user, Model model, HttpSession httpSession){
        User currentUser = userService.checkAuth(user);
        httpSession.setAttribute("currentUser", currentUser);
        httpSession.setAttribute("key1", true);
        model.addAttribute("messageA", "Authorisation successfully");
        return "index";
    }
}
