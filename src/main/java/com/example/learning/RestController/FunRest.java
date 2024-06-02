package com.example.learning.RestController;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRest {

    @Value("${developer.name}")
    private String developerName;

    @Value("${developer.company}")
    private String developerCompany;


    @GetMapping("/hello")
    private String helloWorld(){
        return "Hell World!!";
    }

    @GetMapping("/devinfo")
    private  String getDevInfo(){
        return (developerName +" works in " +developerCompany);
    }

}
