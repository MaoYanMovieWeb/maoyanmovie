package com.hut.maoyanmovie.service;

import com.hut.maoyanmovie.bean.Orders;

import java.util.List;

/**
 * @author Cleanmoo
 * @data 2020/12/9
 */
public interface OrdersService {

    List<Orders> getOrdersByOid(Integer oid);

}
