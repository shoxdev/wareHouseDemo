package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.werehousetask.entity.Output;
import uz.pdp.werehousetask.entity.Product;

import java.util.UUID;

public interface ProductRepositary extends JpaRepository<Product, UUID> {

}
