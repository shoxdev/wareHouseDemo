package uz.pdp.werehousetask.payLoad;

import lombok.Data;

@Data
public class CategoryDto {

    private long id;
    private String name;
    private Long parentCategoryId;
}
