package az.edu.itbrains.furni_online_store.controllers;

import az.edu.itbrains.furni_online_store.dtos.RegisterDto;
import az.edu.itbrains.furni_online_store.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @GetMapping("/register")
    public String register(){
        return "register.html";
    }

    @PostMapping("/register")
    public String register(RegisterDto registerDto){
        boolean result=userService.registerUser(registerDto);
        if(result){
            return "redirect:/register";
        }

        return "redirect:/register";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value="error",required = false) String error, Model model){
        if(error!=null){
            model.addAttribute("login error","Data is false");
        }
        return "register.html";
    }
}
