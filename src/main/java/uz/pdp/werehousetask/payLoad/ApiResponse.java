package uz.pdp.werehousetask.payLoad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    private String massage;
    private boolean success;
    private Object object;
    private long totalElements;
    private int totalPages;

    public ApiResponse(String massage, boolean success) {
        this.massage = massage;
        this.success = success;
    }

    public ApiResponse(String massage, boolean success, Object object) {
        this.massage = massage;
        this.success = success;
        this.object = object;
    }
}
