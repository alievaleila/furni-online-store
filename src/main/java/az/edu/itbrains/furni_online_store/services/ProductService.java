package az.edu.itbrains.furni_online_store.services;

import az.edu.itbrains.furni_online_store.dtos.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> getAllProducts();

    ProductDto getProductById(Long id);
}
