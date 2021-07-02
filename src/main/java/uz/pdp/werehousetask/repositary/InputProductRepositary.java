package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.werehousetask.entity.Input;
import uz.pdp.werehousetask.entity.InputProduct;

import java.util.UUID;

public interface InputProductRepositary extends JpaRepository<InputProduct, UUID> {

}
