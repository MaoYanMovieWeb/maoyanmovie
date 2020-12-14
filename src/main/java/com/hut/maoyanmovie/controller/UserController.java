package com.hut.maoyanmovie.controller;


import com.hut.maoyanmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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
        userService.saveUserByUid(user_name, user_password, user_tel);
        return "login";
        }
        return "register";
    }
}
