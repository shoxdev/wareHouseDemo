package uz.pdp.werehousetask.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.werehousetask.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WareHouseProjection {
    Long getId();
    String getName();
    boolean getActive();
}
