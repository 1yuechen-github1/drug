package com.example.drug.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.drug.common.ResultMapUtil;
import com.example.drug.entity.User;
import com.example.drug.service.IAdminService;
import com.example.drug.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 科研板块相关的controller
 */
@Controller
@RequestMapping("/scientific")
public class ScientificController {


    @Autowired
    private IUserService userService;

    /**
     * 转向Scientific界面
     */
    @GetMapping
    public String scientific(){
        return "/scientific/index";
    }

    /**
     * 转向临床研究界面
     */
    @GetMapping(value = "/clinical")
    public String clinical(){
        return "/scientific/clinical";
    }

    /**
     * 转向基础研究界面
     */
    @GetMapping(value = "/basic")
    public String basic(){
        return "/scientific/basic";
    }

}
