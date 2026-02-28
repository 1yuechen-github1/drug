package com.example.drug.controller;

import com.example.drug.common.ResultMapUtil;
import com.example.drug.config.AdminToken;
import com.example.drug.config.UserToken;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户相关的controller
 */
@Controller
public class UserController {
    /**
     * 转向登录界面
     */
    @RequestMapping(value = "/login")
    public String login(){
        return "/user/login";
    }

    /**
     * 判断用户是否登录成功
     */
    @RequestMapping(value = "/toLogin")
    //使用@ResponseBody注解，表示返回的结果将作为响应的内容，而不是跳转到一个视图页面
    @ResponseBody
    public Object toLogin(String username,String password){
        if(username==null||password==null){
            return ResultMapUtil.getHashMapLogin("用户名密码不能为空","2");
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UserToken(username,password);
        try{
            subject.login(token);
        }catch (UnknownAccountException e){
            return ResultMapUtil.getHashMapLogin("用户名不存在","2");
        }catch (IncorrectCredentialsException e){
            return ResultMapUtil.getHashMapLogin("密码错误","2");
        }
        return ResultMapUtil.getHashMapLogin("验证成功","1");
    }

    /**
     * 判断管理员是否登录成功
     */
    @RequestMapping(value = "/toAdminLogin")
    //使用@ResponseBody注解，表示返回的结果将作为响应的内容，而不是跳转到一个视图页面
    @ResponseBody
    public Object toAdminLogin(String username,String password){
        if(username==null||password==null){
            return ResultMapUtil.getHashMapLogin("密码不能为空","2");
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new AdminToken(username,password);
        try{
            subject.login(token);
        }catch (UnknownAccountException e){
            return ResultMapUtil.getHashMapLogin("用户名不存在","2");
        }catch (IncorrectCredentialsException e){
            return ResultMapUtil.getHashMapLogin("密码错误","2");
        }
        return ResultMapUtil.getHashMapLogin("验证成功","1");
    }
    /**
     * 转向后台管理首页
     */
    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }

    /**
     * 转向管理员首页
     */
    @RequestMapping(value = "/adminindex")
    public String adminindex(){
        return "/admin/adminindex";
    }

    /**
     * 退出登录
     */
    @RequestMapping(value = "/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login";
    }
}
