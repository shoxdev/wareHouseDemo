package uz.pdp.werehousetask.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.werehousetask.entity.Category;

@Projection(types = Category.class)
public interface CategoryProjection {
    Long getId();
    String getName();
    Category getParentCategory();

}
