package com.hut.maoyanmovie.controller;

import com.hut.maoyanmovie.bean.User;
import com.hut.maoyanmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HP
 * @data 2020-12-09
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("saveUserByUid")
    //注册功能，保存数据
    public String saveUserByUid(String user_name, String user_password, String user_tel,String user_repassword){
        if(user_password.equals(user_repassword)){
            //判断密码重复密码是否一致
            //未实现弹窗
        userService.saveUserByUid(user_name, user_password, user_tel);
        return "login";
        }
        return "register";
    }
    @PostMapping("loginUserByTel")
    //登录功能
    public String loginUserByTel(ModelMap modelMap , String user_tel , String user_password ){
                User user = userService.loginUserByTel(user_tel, user_password);
                if(user != null){
                    //成功
                    modelMap.put("user",user);
                    return "loginsuccess";
                }
                return "login";
                    //错误
                    //未实现弹窗
    }

    @GetMapping("/loginsuccess")
    public String loginsuccess(){
        //欢迎页面
        return "loginsuccess";
    }

}
