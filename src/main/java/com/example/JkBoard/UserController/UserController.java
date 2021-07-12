package com.example.JkBoard.UserController;


import com.example.JkBoard.UserDto.UserForm;
import com.example.JkBoard.UserService.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService accountService;

    @GetMapping("/loginUser")
    public String createUserForm(Model model){
        model.addAttribute("userForm",new UserForm ());
        return "Login";
    }

    @PostMapping("/loginUser")
    public String createUser(UserForm form, BindingResult result){
        if(result.hasErrors()){
            return "user/login/register";
        }
        accountService.createUser(form);

        return "redirect:/";
    }
}