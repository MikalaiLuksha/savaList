package by.pelar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/")
public class IndexController {

    @GetMapping
public String start(HttpSession httpSession){
return "index";
    }
}
