package com.SpringBootApp1.First_SpringBoot_Program;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloProgram {
    @GetMapping("abc")
    public String sayHello(){
        return "Chakresh Kumar Ray";
    }
}