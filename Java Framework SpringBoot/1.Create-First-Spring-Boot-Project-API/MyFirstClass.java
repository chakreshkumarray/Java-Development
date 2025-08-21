package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstClass {

    @GetMapping("abc")
    public String sayHello(){
        return "Hello Chakresh Kumar";
    }
}
