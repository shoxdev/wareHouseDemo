package uz.pdp.werehousetask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.werehousetask.entity.template.AbsUuidEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class AttachmentContent extends AbsUuidEntity {
    @Column(nullable = false)
    private byte[] bytes;

    @OneToOne(optional = false)
    private Attachment attachment;
}
