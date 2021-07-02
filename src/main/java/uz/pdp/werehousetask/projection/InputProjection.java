package uz.pdp.werehousetask.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.werehousetask.entity.Input;

@Projection(types = Input.class)
public interface InputProjection {

}
