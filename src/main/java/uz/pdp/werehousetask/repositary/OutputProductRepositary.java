package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.werehousetask.entity.Output;
import uz.pdp.werehousetask.entity.OutputProduct;

import java.util.UUID;

public interface OutputProductRepositary extends JpaRepository<OutputProduct, UUID> {

}
