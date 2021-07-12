package com.example.JkBoard.UserService;


import com.example.JkBoard.Repository.UserRepository;
import com.example.JkBoard.UserDto.UserForm;
import com.example.JkBoard.UserModel.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    private final UserRepository accountRepository;

    @Transactional
    public Long createUser(UserForm form) {
        UserModel account = form.toEntity();
        accountRepository.save(account);
        return account.getId();
    }
}
