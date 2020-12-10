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

}
