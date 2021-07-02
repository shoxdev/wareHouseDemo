package uz.pdp.werehousetask.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.werehousetask.entity.Attachment;
import uz.pdp.werehousetask.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentProjection {

    byte[] getBytes();
    Attachment getAttachment();
}
