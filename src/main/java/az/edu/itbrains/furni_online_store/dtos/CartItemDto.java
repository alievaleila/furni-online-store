package az.edu.itbrains.furni_online_store.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItemDto {

    private Long id;
    private String imageUrl;
    private String name;
    private Double price;
    private Long productId;
    private Integer quantity;

    public double getTotal() {
        return quantity * price;
    }
}
