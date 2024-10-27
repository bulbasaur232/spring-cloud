package com.example.userservice.controller;

import com.example.userservice.vo.Greeting;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class  UserController {

    private final Environment env;
    private final Greeting greeting;

    @GetMapping("/health-check")
    public String status(){
        return "It's working in userService";
    }

    @GetMapping("/welcome")
    public String welcome(){
//        return env.getProperty("greeting.message");
        return greeting.message();
    }

    @PostMapping()
    public String dsf(BindingResult bindingResult){
    }

}
