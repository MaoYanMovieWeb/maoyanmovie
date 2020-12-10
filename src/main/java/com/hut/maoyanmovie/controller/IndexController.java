package com.hut.maoyanmovie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HP
 * @data 2020-12-09
 */
@Controller
public class IndexController {
//首页
    @GetMapping("/maoyanmovie")
    public String index()  {
        return "index";
    }
//电影
    @GetMapping("movie")
    public String movie(){
        return "movie";
    }
//榜单
    @GetMapping("ranking")
    public String ranking(){
        return "ranking";
    }
//热点
    @GetMapping("interview")
    public String interview(){
        return "interview";
    }
//订单
    @GetMapping("interorders")
    public String interorders(){
        return "interorders";
    }


//登录
    @GetMapping("login")
    public String login(){
        return "login";
    }
//注册
    @GetMapping("register")
    public String register(){
        return "register";
    }


    @GetMapping("intro")
    public String intro(){
        return "intro";
    }


//榜单往下的下一层控制器
    @GetMapping("/mostexpectedranking")
    public String mostexpectedranking(){ return "mostexpectedranking"; }

    @GetMapping("/boxofficeranking")
    public String boxofficeranking(){ return "boxofficeranking"; }
}
