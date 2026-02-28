package com.example.drug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/communication")
public class CommunicationController {
    @GetMapping
    public String index() {
        return "/communication/index";
    }
}
