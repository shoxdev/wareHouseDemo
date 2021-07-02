package uz.pdp.werehousetask.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.pdp.werehousetask.entity.Warehouse;
import uz.pdp.werehousetask.payLoad.ApiResponse;
import uz.pdp.werehousetask.payLoad.WareHouseDto;
import uz.pdp.werehousetask.service.WarehouseService;

import java.util.List;

@RestController
@RequestMapping("/api/warehouse")
public class WarehouseController {

//    @Autowired
//    WarehouseService warehouseService;
//
//    @PostMapping
//    public ApiResponse addNewWareHouse(@RequestBody WareHouseDto wareHouseDto){
//        return warehouseService.addNewWareHouse(wareHouseDto);
//    }
//
//    @GetMapping("/getAllWareHouse")
//    public ApiResponse getAll(){
//        return warehouseService.getAll();
//    }
//
//    @GetMapping("/getByIdWareHouse/{wareHouseId}")
//    public ApiResponse getById(@PathVariable long wareHouseId){
//        return warehouseService.getById(wareHouseId);
//    }
//
//    @PutMapping("/edit")
//    public ApiResponse edit(@RequestBody WareHouseDto wareHouseDto){
//        return warehouseService.edit(wareHouseDto);
//    }
//
//    @DeleteMapping("/delete/{wareHouseId}")
//    public ApiResponse delete(@PathVariable long wareHouseId){
//        return warehouseService.delete(wareHouseId);
//    }
}
