package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.werehousetask.entity.Product;
import uz.pdp.werehousetask.entity.Supplier;
import uz.pdp.werehousetask.projection.SupplierProjection;

import java.nio.file.LinkOption;
import java.util.UUID;
@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = SupplierProjection.class)
public interface SupplierRepositary extends JpaRepository<Supplier, Long> {

}
