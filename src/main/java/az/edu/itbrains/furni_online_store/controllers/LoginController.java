package az.edu.itbrains.furni_online_store.controllers;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/register")
    public String register(){
        return "register.html";
    }
}
