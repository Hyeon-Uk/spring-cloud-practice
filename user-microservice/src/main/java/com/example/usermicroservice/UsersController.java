package com.example.usermicroservice;

import com.example.usermicroservice.vo.Greeting;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UsersController {
//    private final Environment env;
    private final Greeting greeting;

    @GetMapping("/health_check")
    public String status(){
        return "It's working in user micro service";
    }

    @GetMapping("/greeting")
    public String greeting(){
//        return env.getProperty("greeting.message");
        return greeting.getMessage();
    }
}