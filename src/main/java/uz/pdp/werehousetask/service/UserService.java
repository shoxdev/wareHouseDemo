package uz.pdp.werehousetask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.werehousetask.entity.User;
import uz.pdp.werehousetask.payLoad.ApiResponse;
import uz.pdp.werehousetask.payLoad.UserDto;
import uz.pdp.werehousetask.repositary.UserRepositary;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    UserRepositary userRepositary;


    public ApiResponse saveNewUser(UserDto userDto){
        User user=new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPhoneNumber(userDto.getPhoneNumber());
        int maxId = userRepositary.getMaxId();
        user.setCode(maxId+1);
        user.setPassword(userDto.getPassword());
        user.setActive(userDto.isActive());
        userRepositary.save(user);
        return new ApiResponse("User saqlandi",true);
    }

    public ApiResponse editUser(UserDto userDto){
        Optional<User> optionalUser = userRepositary.findById(userDto.getId());
        if (optionalUser.isPresent()){
            User user = optionalUser.get();
            user.setFirstName(userDto.getFirstName());
            user.setLastName(userDto.getLastName());
            user.setPassword(userDto.getPassword());
            user.setActive(userDto.isActive());
            user.setPhoneNumber(userDto.getPhoneNumber());
            userRepositary.save(user);
            return new ApiResponse("User ma`lumotlari muvaffaqiyatli o`zgartirildi!",true);
        }else {
            return new ApiResponse("Siz kiritgan user topilmadi!",false);
        }
    }
    public ApiResponse getAllUsers(){
        List<User> userList = userRepositary.findAll();
        return new ApiResponse("OK!",true,userList);
    }

    public ApiResponse getUserById(UUID id){
        return userRepositary.findById(id).map(user -> new ApiResponse("OK!", true, user)).orElseGet(() -> new ApiResponse("ERROR!", false));

    }

    public ApiResponse deleteUser(UUID id){
        Optional<User> optionalUser = userRepositary.findById(id);
        if (optionalUser.isPresent()){
            userRepositary.deleteById(id);
            return new ApiResponse("OK!",true);
        }else {
            return new ApiResponse("ERROR!",false);
        }
    }


}
