package com.example.JkBoard.Controller;

import com.example.JkBoard.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;


    // 로그인 페이지
    @GetMapping("/Login")
    public String dispLogin() {
        return "/Login";
    }

    // 게시판 페이지
    @GetMapping("/Board")
    public String dispBoard() {
        return "/Board";
    }

    // 회원가입 페이지
    @GetMapping("/Member")
    public String dispMember() {
        return "/Member";
    }



}