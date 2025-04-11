package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Usercontroller {

    @GetMapping("/")
    public String hello(){
        return "index";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
}
