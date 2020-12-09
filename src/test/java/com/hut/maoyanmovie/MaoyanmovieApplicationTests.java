package com.hut.maoyanmovie;

import com.hut.maoyanmovie.dao.OrdersMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaoyanmovieApplicationTests {
    @Autowired
    private  OrdersMapper ordersMapper;

    @Test
    void contextLoads() {
        System.out.println(ordersMapper.getOrdersByOid(2));
    }

}
