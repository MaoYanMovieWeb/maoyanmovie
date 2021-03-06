package com.hut.maoyanmovie.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hut.maoyanmovie.bean.Actor;
import com.hut.maoyanmovie.bean.Movie;
import com.hut.maoyanmovie.service.ActorService;
import com.hut.maoyanmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author asus
 * @data 2020/12/9
 */

@Controller
public class MovieController {

    @Autowired
    MovieService movieService;
    @Autowired
    ActorService actorService;

    @GetMapping("/getById")
    public String intro(ModelMap modelMap, Integer mid, HttpSession session){
        Movie movies=movieService.getById(mid);
        Actor actor=actorService.getActor(mid);
        session.setAttribute("mid",mid);
        modelMap.put("movies",movies);
        modelMap.put("actor",actor);
        return "intro";
    }

    @GetMapping("/getMovieByName")
    public String getName(ModelMap modelMap,String movie_name,@RequestParam(defaultValue = "1", value = "pageNum")Integer pageNum){
        PageHelper.startPage(pageNum, 5);
        List<Movie> movies=movieService.getMovieByName(movie_name);
        PageInfo<Movie> pageInfo = new PageInfo<>(movies);
        modelMap.put("movies",movies);
        modelMap.put("pageInfo",pageInfo);
        return "jump";
    }

    @GetMapping ("/deleteMovieById")
    public String delMovie(Integer mid){
        movieService.deleteMovieById(mid);

        return "redirect:/admin_category_list";
    }

    @GetMapping("saveMovie")
    public String saveMovie(Movie movie){
        movieService.saveMovie(movie);
        return "redirect:/admin_category_list";
    }

    @GetMapping("getMovieById")
    //根据mid获取电影信息，返回updateMovie页面
    public String getMovieById(ModelMap modelMap,Integer mid){
        Movie movie = movieService.getById(mid);
        modelMap.put("movie",movie);
        return "/admin/updateMoive";

    }

        @PostMapping("updateMovieByid")
    public String updateMovieByid(Movie movie){
        movieService.updateMovie(movie);
        return "redirect:/admin_category_list";
    }


}