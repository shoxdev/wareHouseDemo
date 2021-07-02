package uz.pdp.werehousetask.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.werehousetask.entity.Client;

@Projection(types = Client.class)
public interface ClientProjection {
    Long getId();
    String getName();
    String getPhoneNumber();
}
