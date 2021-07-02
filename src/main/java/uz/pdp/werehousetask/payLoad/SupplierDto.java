package uz.pdp.werehousetask.payLoad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDto {
    private String name;
    private String phoneNumber;
    private boolean active;
}
