package com.example.JkBoard.UserDto;

import com.example.JkBoard.UserModel.UserModel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class UserForm {

    private Long id;
    private String email;
    private String password;

    @Builder
    public UserForm(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;

    }

    public UserModel toEntity(){
        return UserModel.builder()
                .id(id)
                .email(email)
                .password(password)
                .build();
    }
}