package com.example.JkBoard.Service;

import com.example.JkBoard.Dto.UserDto;
import com.example.JkBoard.Entity.UserEntity;
import com.example.JkBoard.Repository.UserRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    public String saveUser(UserDto userDto){
        return userRepository.save ( userDto.toEntity ()).getEmail ();
    }


}
