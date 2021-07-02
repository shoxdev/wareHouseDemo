package uz.pdp.werehousetask.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.werehousetask.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementProjection {
    Long getId();
    String getName();
    boolean getActive();
}
