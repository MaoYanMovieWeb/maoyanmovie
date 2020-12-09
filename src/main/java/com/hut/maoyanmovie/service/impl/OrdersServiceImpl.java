package com.hut.maoyanmovie.service.impl;

import com.hut.maoyanmovie.bean.Orders;
import com.hut.maoyanmovie.dao.OrdersMapper;
import com.hut.maoyanmovie.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Cleanmoo
 * @data 2020/12/9
 */

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public List<Orders> getOrdersByOid(Integer oid) {
        return ordersMapper.getOrdersByOid(oid);
    }
}