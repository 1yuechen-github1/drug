package com.example.drug.controller;

import com.example.drug.common.ResultMapUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 主页相关的controller
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    /**
     * 转向console界面
     */
    @GetMapping(value = "/console")
    public String console(){
        return "/home/console";
    }

}
