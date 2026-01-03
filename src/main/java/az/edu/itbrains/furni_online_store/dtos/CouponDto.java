package az.edu.itbrains.furni_online_store.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CouponDto {

    private String code;

    private BigDecimal discountPercentage;

    private Boolean active;
}
