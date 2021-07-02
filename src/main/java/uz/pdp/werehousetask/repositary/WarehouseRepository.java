package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.werehousetask.entity.User;
import uz.pdp.werehousetask.entity.Warehouse;
import uz.pdp.werehousetask.projection.WareHouseProjection;

import java.util.UUID;
@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = WareHouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {

}
