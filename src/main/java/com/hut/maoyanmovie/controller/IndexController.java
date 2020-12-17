package com.hut.maoyanmovie.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hut.maoyanmovie.bean.Movie;
import com.hut.maoyanmovie.bean.Orders;
import com.hut.maoyanmovie.bean.User;
import com.hut.maoyanmovie.service.MovieService;
import com.hut.maoyanmovie.service.OrdersService;
import com.hut.maoyanmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author HP
 * @data 2020-12-09
 */
@Controller
public class IndexController {
    @Autowired
    private UserService userService;
    @Autowired
    private MovieService movieService;
    @Autowired
    private OrdersService ordersService;
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

//登录
    @GetMapping("login")
    public String login(HttpSession session){
        if(session.getAttribute("loginUser") != null){
            return "logging";
        }
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


/*
* 以下为后台页面控制器
*
* */


    @GetMapping(value="/admin")
    public String admin(ModelMap modelMap){
        List<User> users = userService.selectAll();
        List<Movie> movies = movieService.getAll();
        List<Orders> orders = ordersService.getAll();
        modelMap.put("users",users);
        modelMap.put("movies",movies);
        modelMap.put("orders",orders);
        return "redirect:admin_category_list";
    }

    @GetMapping(value="/admin_category_list")
    public String listCategory(ModelMap modelMap,@RequestParam(defaultValue = "1", value = "pageNum")Integer pageNum){
        PageHelper.startPage(pageNum, 5);

        List<Movie> movies = movieService.getAll();

        PageInfo<Movie> pageInfo = new PageInfo<>(movies);

        modelMap.put("movies",movies);

        modelMap.put("pageInfo",pageInfo);
        return "admin/listCategory";
    }

    @GetMapping("/admin_user_list")
    public String listUser(ModelMap modelMap,@RequestParam(defaultValue = "1", value = "pageNum")Integer pageNum){
        PageHelper.startPage(pageNum, 5);

        List<User> users = userService.selectAll();

        modelMap.put("users",users);

        PageInfo<User> pageInfo = new PageInfo<>(users);

        modelMap.put("pageInfo",pageInfo);
        return "/admin/listUser";
    }

    @GetMapping("/admin_order_list")
    public String listOrder(ModelMap modelMap,@RequestParam(defaultValue = "1", value = "pageNum")Integer pageNum){
        PageHelper.startPage(pageNum, 50);
        List<User> users = userService.selectAll();
        List<Movie> movies = movieService.getAll();
        List<Orders> orders = ordersService.getAll();
        modelMap.put("users",users);
        modelMap.put("movies",movies);
        modelMap.put("orders",orders);
        PageInfo<Orders> pageInfo = new PageInfo<>(orders);
        modelMap.put("pageInfo",pageInfo);
        return "/admin/listOrder";
    }


}
