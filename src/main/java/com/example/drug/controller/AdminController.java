package com.example.drug.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.drug.common.ResultMapUtil;
import com.example.drug.entity.Patient;
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
 * 管理员相关的controller
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    @Autowired
    private IUserService userService;

    /**
     * 转向usermanagement界面
     */
    @GetMapping(value = "/usermanagement")
    public String console(){
        return "/admin/usermanagement";
    }

    /**
     * 分页查询用户列表
     */
    @RequestMapping(value = "/userQueryPage")
    @ResponseBody
    public Object patientAppointmentQueryPage(
                                              @RequestParam(value = "page", defaultValue = "1") int pageNum,
                                              @RequestParam(value = "limit", defaultValue = "18") int pageSize) {
        try {
            IPage<User> iPage = userService.selectUserPage(pageNum, pageSize);
            return ResultMapUtil.getHashMapMysqlPage(iPage);
        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 添加一个用户档案
     */
    @RequestMapping(value = "/userAdd")
    @ResponseBody
    @Transactional
    public Object patientAdd(User user) {
        try {
        int i = userService.addUser(user);
        if(i!=0){
            return ResultMapUtil.getHashMapSave(1);
        }
        return ResultMapUtil.getHashMapSave(0);

        } catch (Exception e) {
            return ResultMapUtil.getHashMapException(e);
        }
    }

    /**
     * 转向userArchiving界面
     */
    @GetMapping(value = "/userArchiving")
    public String userArchiving(){
        return "/admin/userArchiving";
    }


}
