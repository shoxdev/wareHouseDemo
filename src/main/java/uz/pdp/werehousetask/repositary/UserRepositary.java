package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.pdp.werehousetask.entity.Product;
import uz.pdp.werehousetask.entity.User;

import java.util.UUID;

public interface UserRepositary extends JpaRepository<User, UUID> {

    @Query(value = "select coalesce(max(code),0) from users",nativeQuery = true)
    int getMaxId();
}
