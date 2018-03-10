package com.firevo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
@Controller
public class MainController {
    @GetMapping()
    public String index() {
        return "main";
    }

    @GetMapping("/map")
    public String map(){
        return "map";
    }

    @GetMapping("/product/registration")
    public String registerForm() {
        return "register";
    }
}