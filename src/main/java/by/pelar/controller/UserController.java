package by.pelar.controller;


import by.pelar.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @GetMapping(path = "/reg")
    public String reg (Model model){
        model.addAttribute("user", new User());
        return "reg";
    }
}
