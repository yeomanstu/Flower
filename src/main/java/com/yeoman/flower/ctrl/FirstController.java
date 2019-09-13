package com.yeoman.flower.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @RequestMapping("/test")
    public String hello(){
        System.out.println("hello world");
        return "hello World!";
    }
}
