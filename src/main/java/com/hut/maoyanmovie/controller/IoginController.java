package com.hut.maoyanmovie.controller;

import com.hut.maoyanmovie.bean.User;
import com.hut.maoyanmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author HP
 * @data 2020-12-14
 */
@Controller
public class IoginController {

    @Autowired
    UserService userService;

    @PostMapping("loginUserByTel")
    public String login(
            @RequestParam("user_tel") String user_tel,
            @RequestParam("user_password") String user_password,
            Model model,
            HttpSession session) {

        User user = userService.loginUserByTel(user_tel, user_password);
        if (user != null) {
            model.addAttribute("msg","登录成功！ 欢迎你！"+user.getUser_name());
            session.setAttribute("loginUser", user_tel);
        } else {
            model.addAttribute("msg", "登录失败！用户名或密码错误！");
        }
        return "logging";
    }

    @RequestMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }


    @GetMapping("logging")
    public String logging(){
        //欢迎页面
        return "logging";
    }
}
