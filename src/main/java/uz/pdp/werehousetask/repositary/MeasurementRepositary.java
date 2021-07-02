package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.werehousetask.entity.Currency;
import uz.pdp.werehousetask.entity.Measurement;
import uz.pdp.werehousetask.projection.MeasurementProjection;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "list",excerptProjection = MeasurementProjection.class)
public interface MeasurementRepositary extends JpaRepository<Measurement, Long> {

}
