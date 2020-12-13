package com.hut.maoyanmovie.service.impl;

import com.hut.maoyanmovie.bean.Movie;
import com.hut.maoyanmovie.dao.MovieMapper;
import com.hut.maoyanmovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author asus
 * @data 2020/12/9
 */

@Service
public class MovieServiceimpl implements MovieService {
    @Autowired
    MovieMapper movieMapper;

    @Override
    public List<Movie> getMovieByName(String movie_name){return movieMapper.getMovieByName(movie_name); }
    public Movie getById(Integer mid){ return movieMapper.getById(mid); }
    public void saveMovie(Movie movie){
        movieMapper.saveMovie(movie);
    }
    public void deleteMovieById(Integer mid){
        movieMapper.deleteMovieById(mid);
    }
    public void updateMovie(Movie movie){
        movieMapper.updateMovie(movie);
    }

    @Override
    public List<Movie> getAll() {
        return movieMapper.getAll();
    }
}