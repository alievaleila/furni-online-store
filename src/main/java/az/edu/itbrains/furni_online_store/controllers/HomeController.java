package az.edu.itbrains.furni_online_store.controllers;

import az.edu.itbrains.furni_online_store.dtos.ProductDto;
import az.edu.itbrains.furni_online_store.dtos.TestimonialsDto;
import az.edu.itbrains.furni_online_store.services.ProductService;
import az.edu.itbrains.furni_online_store.services.TestimonialsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ProductService productService;
    private final TestimonialsService testimonialsService;

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

    @GetMapping("/checkout")
    public String checkout(){
        return "checkout.html";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact.html";
    }

    @GetMapping("/services")
    public String services(Model model){
        List<TestimonialsDto>testimonialsDtoList=testimonialsService.getAllTestimonials();
        model.addAttribute("testimonials",testimonialsDtoList);
        return "services.html";
    }

    @GetMapping("/shop")
    public String shop(Model model){
        List<ProductDto> productDtoList=productService.getAllProducts();
        model.addAttribute("products",productDtoList);
        return "shop.html";
    }

    @GetMapping("/thankyou")
    public String thankyou(){
        return "thankyou.html";
    }

    @GetMapping("/product/{id}")
    public String detail(@PathVariable Long id,Model model){
        ProductDto productDto=productService.getProductById(id);
        model.addAttribute("product",productDto);
        return "detail.html";



    }
}
