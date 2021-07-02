package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.werehousetask.entity.Client;
import uz.pdp.werehousetask.entity.Input;

import java.util.UUID;

public interface InputRepositary extends JpaRepository<Input, UUID> {

}
