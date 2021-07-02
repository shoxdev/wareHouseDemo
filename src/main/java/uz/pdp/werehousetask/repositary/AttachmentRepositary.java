package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.werehousetask.entity.Attachment;
import uz.pdp.werehousetask.projection.AttachmentProjection;

import java.util.UUID;
@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",excerptProjection = AttachmentProjection.class)
public interface AttachmentRepositary extends JpaRepository<Attachment, UUID> {

}
