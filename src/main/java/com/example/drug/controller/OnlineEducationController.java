package com.example.drug.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 在线教育控制器
 */
@Controller
@RequestMapping("/onlineEducation")
public class OnlineEducationController {
    @GetMapping
    public String index() {
        return "/onlineEducation/index";
    }
}
