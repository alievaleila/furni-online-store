package az.edu.itbrains.furni_online_store.repositories;

import az.edu.itbrains.furni_online_store.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Long> {
    List<Cart> findByUserUsername(String username);
}
