package az.edu.itbrains.furni_online_store.repositories;

import az.edu.itbrains.furni_online_store.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{
}
