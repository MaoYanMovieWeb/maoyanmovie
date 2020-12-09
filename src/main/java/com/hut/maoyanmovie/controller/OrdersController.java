package com.hut.maoyanmovie.controller;

import com.hut.maoyanmovie.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Cleanmoo
 * @data 2020/12/9
 */

@Controller
public class OrdersController {
    @Autowired
    private OrdersService ordersService;


    @GetMapping("/getOrdersByOid")
    public String getOrdersByOid(ModelMap modelMap,Integer oid){


        return "";
    }
}