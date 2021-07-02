package uz.pdp.werehousetask.payLoad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WareHouseDto {

    private long id;
    private String name;
    private boolean active;
}
