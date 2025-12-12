package az.edu.itbrains.furni_online_store.services.impl;

import az.edu.itbrains.furni_online_store.dtos.ProductDto;
import az.edu.itbrains.furni_online_store.repositories.ProductRepository;
import az.edu.itbrains.furni_online_store.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDto> getAllProducts() {
        List<ProductDto> productDtoList= productRepository.findAll().stream()
                .map(product -> modelMapper.map(product,ProductDto.class)).collect(Collectors.toList());
        return productDtoList;
    }
}
