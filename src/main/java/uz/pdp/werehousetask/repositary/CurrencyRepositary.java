package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.werehousetask.entity.Client;
import uz.pdp.werehousetask.entity.Currency;

import java.util.UUID;

public interface CurrencyRepositary extends JpaRepository<Currency, Long> {

}
