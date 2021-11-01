package com.cos.BLOG.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller // 파일을 호출
public class UserController {

    // 로그인 페이지 이동
    @GetMapping("user/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    // 회원가입 페이지 이동
    @GetMapping("user/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    // 회원 상세보기 페이지 이동
    @GetMapping("user/{id}")
    public String userInfo(@PathVariable int id) {
        return "user/updateForm";
    }
}
