package uz.pdp.werehousetask.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.werehousetask.payLoad.SupplierDto;

@Projection(types = SupplierDto.class)
public interface SupplierProjection {
    Long getId();
    String getName();
    String getPhoneNumber();
    boolean getActive();
}
