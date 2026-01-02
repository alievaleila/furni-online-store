package az.edu.itbrains.furni_online_store.controllers;

import az.edu.itbrains.furni_online_store.dtos.CartItemDto;
import az.edu.itbrains.furni_online_store.services.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @GetMapping("/cart")
    private String cart(Model model, Principal principal){
        if(principal==null){
            return "redirect:/login";
        }

        String username=principal.getName();
        List<CartItemDto> cartItemDtoList=cartService.getCartItemByUsername(username);
        double subtotal=cartService.calculateSubtotal(cartItemDtoList);
        model.addAttribute("cartItems",cartItemDtoList);
        model.addAttribute("cartTotal", subtotal);
        return "cart";
    }

    @PostMapping("/cart/add")
    public String addToCart(@RequestParam Long productId,Principal principal) {
        if (principal == null) {
            return "redirect:/login";
        }
    }


    @PostMapping("/delete")
    public String delete(@RequestParam Long productId, Principal principal){
        if(principal==null){
            return "redirect:/login";
        }

        String username=principal.getName();
        cartService.deleteItem(username,productId);
        return "redirect:/cart";
    }

    @PostMapping("/update")
    public String update(@RequestParam Long productId, String action, Principal principal){
        if(principal==null){
            return "redirect:/login";
        }

        String username=principal.getName();
        cartService.updateQuantity(username,productId);
        return "redirect:/cart";
    }




}
