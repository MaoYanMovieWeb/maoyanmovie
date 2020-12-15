package com.hut.maoyanmovie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author HP
 * @data 2020-12-15
 */
@Controller
public class AdminController {
    @GetMapping("addMoive")
    public String addMoive(){
        return "admin/addMoive";
}


}
