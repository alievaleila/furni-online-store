package az.edu.itbrains.furni_online_store.services.impl;

import az.edu.itbrains.furni_online_store.dtos.TestimonialsDto;
import az.edu.itbrains.furni_online_store.repositories.TestimonialsRepository;
import az.edu.itbrains.furni_online_store.services.TestimonialsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TestimonialsServiceImpl implements TestimonialsService {

    private final TestimonialsRepository testimonialsRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<TestimonialsDto> getAllTestimonials() {
        List<TestimonialsDto>testimonialsDtoList=testimonialsRepository.findAll().stream().limit(3)
                .map(testimonals -> modelMapper.map(testimonals, TestimonialsDto.class))
                .collect(Collectors.toList());
        return testimonialsDtoList;
    }
}
