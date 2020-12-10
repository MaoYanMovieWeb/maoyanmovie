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

    @GetMapping("/maoyanmovie")
    public String index()  {
        return "index";
    }

    @GetMapping("movie")
    public String movie(){
        return "movie";
    }

    @GetMapping("ranking")
    public String ranking(){
        return "ranking";
    }

    @GetMapping("interview")
    public String interview(){
        return "interview";
    }

    @GetMapping("interorders")
    public String interorders(){
        return "interorders";
    }



    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("register")
    public String register(){
        return "register";
    }


    @GetMapping("intro")
    public String intro(){
        return "intro";
    }
}
