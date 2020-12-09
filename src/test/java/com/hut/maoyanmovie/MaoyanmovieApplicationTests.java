package com.hut.maoyanmovie;

import com.hut.maoyanmovie.bean.Movie;
import com.hut.maoyanmovie.dao.MovieMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaoyanmovieApplicationTests {

    @Autowired
    MovieMapper movieMapper;

    @Test
    void contextLoads() {
        System.out.println(movieMapper.getMovieByName("湄公河"));
    }

}
