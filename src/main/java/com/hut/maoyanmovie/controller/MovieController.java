package com.hut.maoyanmovie.controller;

import com.hut.maoyanmovie.bean.Actor;
import com.hut.maoyanmovie.bean.Movie;
import com.hut.maoyanmovie.dao.MovieMapper;
import com.hut.maoyanmovie.service.ActorService;
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
    ActorService actorService;

    @GetMapping("/getById")
    public String intro(ModelMap modelMap,Integer mid){
        Movie movies=movieService.getById(mid);
        Actor actor=actorService.getActor(mid);
        modelMap.put("movies",movies);
        modelMap.put("actor",actor);
        return "intro";
    }

    @GetMapping("/getMovieByName")
    public String getName(ModelMap modelMap,String movie_name){
        List<Movie> movies=movieService.getMovieByName(movie_name);
        modelMap.put("movies",movies);
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
}