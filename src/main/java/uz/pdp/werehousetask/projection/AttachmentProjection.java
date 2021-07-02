package uz.pdp.werehousetask.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.werehousetask.entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentProjection {
    Long getId();
     String getName();
     double getSize();
     String getContentType();
}
