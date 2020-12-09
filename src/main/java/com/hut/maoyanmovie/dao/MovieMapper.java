package com.hut.maoyanmovie.dao;

import com.hut.maoyanmovie.bean.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author asus
 * @data 2020/12/9
 */

@Mapper
@Repository
public interface MovieMapper {
    List<Movie> getMovieByName(String movie_name);
}
