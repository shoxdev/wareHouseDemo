package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.werehousetask.entity.Input;
import uz.pdp.werehousetask.entity.Output;

import java.util.UUID;

public interface OutputRepositary extends JpaRepository<Output, UUID> {

}
