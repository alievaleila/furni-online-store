package az.edu.itbrains.furni_online_store.controllers;

import az.edu.itbrains.furni_online_store.dtos.ProductDto;
import az.edu.itbrains.furni_online_store.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ProductService productService;

    @GetMapping("/")
    public String index(Model model){
        List<ProductDto> productDtoList=productService.getAllProducts();
        model.addAttribute("products",productDtoList);
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
