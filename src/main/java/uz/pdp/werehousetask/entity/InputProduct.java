package uz.pdp.werehousetask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.werehousetask.entity.template.AbsUuidEntity;

import javax.persistence.*;
import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class InputProduct extends AbsUuidEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @Column(nullable = false)
    private double amount;
    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private Date expireDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Input input;

}
