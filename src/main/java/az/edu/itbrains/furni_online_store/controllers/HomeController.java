package az.edu.itbrains.furni_online_store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/about")
    public String about(){
        return "about.html";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog.html";
    }

    @GetMapping("/cart")
    public String cart(){
        return "cart.html";
    }

    @GetMapping("/checkout")
    public String checkout(){
        return "checkout.html";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }

    @GetMapping("/services")
    public String services(){
        return "services.html";
    }

    @GetMapping("/shop")
    public String shop(){
        return "shop.html";
    }

    @GetMapping("/thankyou")
    public String thankyou(){
        return "thankyou.html";
    }


}
