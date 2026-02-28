package com.example.drug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teaching")
public class TeachingController {
    @GetMapping
    public String index(){
        return "/teaching/index";
    }
}
