package com.hut.maoyanmovie.service;


import com.hut.maoyanmovie.bean.Movie;

import java.util.List;

/**
 * @author asus
 * @data 2020/12/9
 */


public interface MovieService {
    List<Movie> getMovieByName(String movie_name);
    Movie getById(Integer mid);
    void saveMovie(Movie movie);
    void deleteMovieById(Integer mid);
    void updateMovie(Movie movie);
    List<Movie> getAll();
}
