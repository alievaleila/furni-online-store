package az.edu.itbrains.furni_online_store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactDashController {

    @GetMapping("/admin/contact")
    public String dashContact(){
        return "/dashboard/contact/index.html";
    }
}
