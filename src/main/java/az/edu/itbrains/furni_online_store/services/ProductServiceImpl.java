package az.edu.itbrains.furni_online_store.services;

import az.edu.itbrains.furni_online_store.dtos.ProductDto;
import az.edu.itbrains.furni_online_store.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;
    @Override

    public List<ProductDto> getAllProducts() {
//        List<ProductDto> productDtoList=
        return List.of();
    }
}
