package com.hut.maoyanmovie.dao;

import com.hut.maoyanmovie.bean.Cinema;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-16
 */
@Mapper
public interface CinemaMapper {
    List<Cinema> getAllCinema ();
}
