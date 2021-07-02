package uz.pdp.werehousetask.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.werehousetask.entity.Attachment;
import uz.pdp.werehousetask.entity.AttachmentContent;
import uz.pdp.werehousetask.projection.AttachmentContentProjection;

import java.util.UUID;
@RepositoryRestResource(path = "attachmentContent",collectionResourceRel = "list",excerptProjection = AttachmentContentProjection.class)
public interface AttachmentContentRepositary extends JpaRepository<AttachmentContent, UUID> {

}
