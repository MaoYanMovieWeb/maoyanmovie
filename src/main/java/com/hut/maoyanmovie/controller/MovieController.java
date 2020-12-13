package com.hut.maoyanmovie.controller;

import com.hut.maoyanmovie.bean.Movie;
import com.hut.maoyanmovie.dao.MovieMapper;
import com.hut.maoyanmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

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
    MovieMapper movieMapper;

    @GetMapping("/getById")
    public String intro(ModelMap modelMap,Integer mid){
        Movie movies=movieService.getById(mid);
        modelMap.put("movies",movies);
        return "intro";
    }

    @GetMapping("/getMovieByName")
    public String getName(ModelMap modelMap,String movie_name){
        List<Movie> movies=movieService.getMovieByName(movie_name);
        modelMap.put("movies",movies);
        return "jump";
    }
}