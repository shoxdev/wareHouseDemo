package uz.pdp.werehousetask.service;

import org.springframework.stereotype.Service;

@Service
public class WarehouseService {
//
//    @Autowired
//    WarehouseRepositary warehouseRepositary;
//
//
//    public ApiResponse addNewWareHouse(WareHouseDto wareHouseDto) {
//        Warehouse wareHouse=new Warehouse();
//        wareHouse.setName(wareHouseDto.getName());
//        wareHouse.setActive(wareHouseDto.isActive());
//        warehouseRepositary.save(wareHouse);
//        return new ApiResponse("New WareHouse added",true);
//    }
//
//    public ApiResponse getAll() {
//        List<Warehouse> warehouseList = warehouseRepositary.findAll();
//        return new ApiResponse("OK!",true,warehouseList);
//    }
//
//    public ApiResponse getById(long wareHousedId) {
//        Optional<Warehouse> optional = warehouseRepositary.findById(wareHousedId);
//        if (!optional.isPresent()){
//            return new ApiResponse("Error",false);
//        }
//        Warehouse warehouse = optional.get();
//        return new ApiResponse("OK!",true,warehouse);
//    }
//
//    public ApiResponse edit(WareHouseDto wareHouseDto) {
//        Optional<Warehouse> optional = warehouseRepositary.findById(wareHouseDto.getId());
//        if (!optional.isPresent()){
//            return new ApiResponse("This WareHouse not found",false);
//        }
//        Warehouse warehouse = optional.get();
//        warehouse.setActive(wareHouseDto.isActive());
//        warehouse.setName(wareHouseDto.getName());
//        warehouseRepositary.save(warehouse);
//        return new ApiResponse("Success edited",true);
//    }
//
//    public ApiResponse delete(long wareHouseId) {
//        ApiResponse apiResponse=new ApiResponse();
//        Optional<Warehouse> optional = warehouseRepositary.findById(wareHouseId);
//        if (!optional.isPresent()){
//            apiResponse.setMassage("This WareHouse not found");
//            return apiResponse;
//        }
//        warehouseRepositary.deleteById(wareHouseId);
//         apiResponse.setMassage("Success deleted warehouse");
//         return apiResponse;
//    }
}
