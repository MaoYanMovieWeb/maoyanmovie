package com.hut.maoyanmovie.controller;

import com.hut.maoyanmovie.bean.Orders;
import com.hut.maoyanmovie.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Cleanmoo
 * @data 2020/12/9
 */

@Controller
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @GetMapping("interorders")
    public String interorders(ModelMap modelMap, HttpSession session){
        Integer uid = Integer.parseInt(session.getAttribute("uid").toString());
        List<Orders> orders = ordersService.selectByuid(uid);
        modelMap.put("orders",orders);
        return "interorders";
    }

    @GetMapping("interorders/insertOrdersByOid")
    public String insertOrdersByOid(ModelMap modelMap, HttpSession session){

        return "interorders";
    }
}