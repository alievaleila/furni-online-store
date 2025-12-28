package az.edu.itbrains.furni_online_store.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestimonialsDto {
    private String description;
    private String imageUrl;
    private String job;
    private String name;
}
