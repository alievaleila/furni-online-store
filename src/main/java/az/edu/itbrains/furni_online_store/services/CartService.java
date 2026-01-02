package az.edu.itbrains.furni_online_store.services;

import az.edu.itbrains.furni_online_store.dtos.CartItemDto;

import java.util.List;

public interface CartService {
    
    List<CartItemDto> getCartItemByUsername(String username);

    double calculateSubtotal(List<CartItemDto> cartItemDtoList);

    void deleteItem(String username, Long productId);

    void increaseQuantity(String username, Long productId);

    void decreaseQuantity(String username, Long productId);
}
