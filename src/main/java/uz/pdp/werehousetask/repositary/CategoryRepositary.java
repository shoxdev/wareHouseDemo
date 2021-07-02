package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.werehousetask.entity.Attachment;
import uz.pdp.werehousetask.entity.Category;
import uz.pdp.werehousetask.projection.CategoryProjection;

import java.util.UUID;
@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CategoryProjection.class)
public interface CategoryRepositary extends JpaRepository<Category, Long> {

}
