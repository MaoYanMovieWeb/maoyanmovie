package com.hut.maoyanmovie.controller;

import com.hut.maoyanmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author HP
 * @data 2020-12-09
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    //注册功能，保存数据
    public String saveUserByUid(String user_name, String user_password, String user_tel){
        userService.saveUserByUid(user_name, user_password, user_tel);

        return "/";
    }

}
