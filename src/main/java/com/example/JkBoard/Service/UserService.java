package com.example.JkBoard.Service;

import com.example.JkBoard.Dto.UserDto;
import com.example.JkBoard.Entity.UserEntity;
import com.example.JkBoard.Repository.UserRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    public List<UserDto> getList() {
        List<UserDto> userDtoList = new ArrayList<> ();

        for (UserDto userEntity : userDtoList) {
            userDtoList.add(convertEntityToDto(userEntity));
        }

        return userDtoList;
    }

    private UserDto convertEntityToDto(UserDto userEntity) {
        return UserDto.builder()
                .id(userEntity.getId())
                .email (userEntity.getEmail ())
                .password (userEntity.getPassword ())
                .build();
    }
}
