package com.hut.maoyanmovie;

import com.hut.maoyanmovie.dao.UserMapper;
import com.hut.maoyanmovie.service.MovieService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaoyanmovieApplicationTests {
    @Autowired
    MovieService movieService;
    @Test
    void contextLoads() {


    }

}
