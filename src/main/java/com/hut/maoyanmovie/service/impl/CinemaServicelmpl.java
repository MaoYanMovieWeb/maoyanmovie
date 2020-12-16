package com.hut.maoyanmovie.service.impl;

import com.hut.maoyanmovie.bean.Cinema;
import com.hut.maoyanmovie.dao.CinemaMapper;
import com.hut.maoyanmovie.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-16
 */
@Service
public class CinemaServicelmpl implements CinemaService {
    @Autowired
    CinemaMapper cinemaMapper;

    @Override
    public List<Cinema> getAllCinema() {

        return cinemaMapper.getAllCinema();
    }
}
