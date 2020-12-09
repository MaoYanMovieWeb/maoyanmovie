package com.hut.maoyanmovie.dao;

import com.hut.maoyanmovie.bean.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Cleanmoo
 * @data 2020/12/9
 */

@Mapper

public interface OrdersMapper {

    List<Orders> getOrdersByOid(Integer oid);   //查询订单

    void editOrdersByOid();                 //修改订单

    void delOrdersByOid();              //删除订单

    void insertOrdersByOid();               //添加订单

}
