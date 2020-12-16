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
   @Autowired(required = false)
   private OrdersMapper ordersMapper;

    @Override
    public Orders getOrdersByOid(Integer oid) {
        return ordersMapper.getOrdersByOid(oid);
    }

    @Override
    public void editOrdersByOid(Orders order) {
        ordersMapper.editOrdersByOid(order);
    }

    @Override
    public void delOrdersByOid(Integer oid) {
        ordersMapper.delOrdersByOid(oid);
    }

    @Override
    public void insertOrdersByOid(Integer uid,Integer mid,String order_time) {
        ordersMapper.insertOrdersByOid(uid, mid, order_time);
    }

    @Override
    public List<Orders> selectByuid(Integer uid) {
        return ordersMapper.selectByuid(uid);
    }

    @Override

    public List<Orders> getAll() {
        return ordersMapper.getAll();
    }
}