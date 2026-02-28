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
 * 医生管理相关的controller
 */
@Controller
@RequestMapping("/doctor")
public class DoctorManagementController {


    /**
     *
     */
    @GetMapping
    public String index() {
        return "/doctorManagement/index";
    }


}
