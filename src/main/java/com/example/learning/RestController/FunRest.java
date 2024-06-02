package com.example.learning.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRest {

    @GetMapping("/hello")
    private String helloWorld(){
        return "Hell World!!";
    }
}
