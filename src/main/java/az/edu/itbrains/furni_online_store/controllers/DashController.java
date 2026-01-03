package az.edu.itbrains.furni_online_store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashController {

    @GetMapping("/admin")
    public String dashboard() {
        return "/dashboard/index.html";
    }
}
