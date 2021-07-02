package uz.pdp.werehousetask.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import uz.pdp.werehousetask.entity.template.AbsName;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Currency extends AbsName {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Currency currency = (Currency) o;

        return getId() != null && getId().equals(currency.getId());
    }

    @Override
    public int hashCode() {
        return 43696292;
    }
}
