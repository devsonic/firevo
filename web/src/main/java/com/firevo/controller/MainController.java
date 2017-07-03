package com.firevo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/")
@Controller
public class MainController {
    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("message", "hello firevo!");
        return "main";
    }

    @RequestMapping("map")
    public String map(){
        return "map";
    }
}