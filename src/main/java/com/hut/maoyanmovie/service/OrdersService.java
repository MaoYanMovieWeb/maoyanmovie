package com.hut.maoyanmovie.service;

import com.hut.maoyanmovie.bean.Orders;

import java.util.List;

/**
 * @author Cleanmoo
 * @data 2020/12/9
 */
public interface OrdersService {

    Orders getOrdersByOid(Integer oid);

    void editOrdersByOid(Orders order);

    void delOrdersByOid(Integer oid);

    void insertOrdersByOid(Integer uid,Integer mid,String order_time);

    List<Orders> getAll();

    List<Orders> selectByuid (Integer uid);
}
