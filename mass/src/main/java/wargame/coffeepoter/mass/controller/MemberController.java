package wargame.coffeepoter.mass.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    /**
        회원가입 페이지 불러오기
     */
    @GetMapping("/register")
    public String getRegisterForm() {
        //회원가입
        return null;
    }

    /**
        회원가입 수행
     */
    @PostMapping("/register")
    public String register() {

        return null;
    }

    /**
        로그인 페이지 불러오기
     */
    @GetMapping("/login")
    public String getLoginForm() {


        return null;
    }

    /**
        로그인 수행
     */
    @PostMapping("/login")
    public String login() {

        return null;
    }


}
