package az.edu.itbrains.furni_online_store.services.impl;

import az.edu.itbrains.furni_online_store.dtos.CartItemDto;
import az.edu.itbrains.furni_online_store.models.Cart;
import az.edu.itbrains.furni_online_store.repositories.CartRepository;
import az.edu.itbrains.furni_online_store.services.CartService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<CartItemDto> getCartItemByUsername(String username) {
        List<Cart> carts = cartRepository.findByUsername(username);

        return carts.stream().map(cart -> new CartItemDto(cart.getId(), cart.getProduct().getImageUrl(), cart.getProduct().getName(), cart.getProduct().getPrice(), cart.getQuantity())).toList();
    }


    @Override
    public double calculateSubtotal(List<CartItemDto> cartItemDtoList) {
        return cartItemDtoList.stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
    }

    @Override
    public void deleteItem(String username, Long productId) {
        Cart item = cartRepository.findByUsernameAndProductId(username, productId);
        if (item != null) {
            cartRepository.delete(item);
        }
    }

    @Override
    public void increaseQuantity(String username, Long productId) {
        Cart item = cartRepository.findByUsernameAndProductId(username, productId);
        if (item != null) {
            item.setQuantity(item.getQuantity());
            cartRepository.save(item);
        }
    }

    @Override
    public void decreaseQuantity(String username, Long productId) {
        Cart item = cartRepository.findByUsernameAndProductId(username, productId);
        if (item != null) {
            if (item.getQuantity() > 1) {
                item.setQuantity(item.getQuantity() - 1);
                cartRepository.save(item);
            } else {
                cartRepository.delete(item);
            }
        }
    }
}
