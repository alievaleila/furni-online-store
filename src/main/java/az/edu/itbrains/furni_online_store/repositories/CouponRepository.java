package az.edu.itbrains.furni_online_store.repositories;

import az.edu.itbrains.furni_online_store.models.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
}
