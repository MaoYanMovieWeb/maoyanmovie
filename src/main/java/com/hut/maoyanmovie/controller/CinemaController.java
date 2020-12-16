package com.hut.maoyanmovie.controller;

import com.hut.maoyanmovie.bean.Cinema;
import com.hut.maoyanmovie.service.CinemaService;
import com.hut.maoyanmovie.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author HP
 * @data 2020-12-16
 */
@Controller
public class CinemaController {
    @Autowired
    CinemaService cinemaService;
    @Autowired
    OrdersService ordersService;

    @GetMapping("Cinema")
    public String getAllCinema(ModelMap modelMap){
       List<Cinema> cinemas =  cinemaService.getAllCinema();
       modelMap.put("cinemas",cinemas);
        return "Cinema";
    }

    @GetMapping("Getcid")
    public String Getcid(HttpSession session,Integer cid){
        session.setAttribute("cid",cid);
        Integer uid = Integer.parseInt(session.getAttribute("uid").toString());
        Integer mid = Integer.parseInt(session.getAttribute("mid").toString());
        cid = Integer.parseInt(session.getAttribute("cid").toString());
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String order_time = formatter.format(date);
        ordersService.insertOrdersByOid(uid, mid, cid,order_time);
        return "redirect:/interorders";
    }
}
