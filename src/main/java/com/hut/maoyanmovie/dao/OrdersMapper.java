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

    Orders getOrdersByOid(Integer oid);   //查询订单

    void editOrdersByOid(Orders order);        //修改订单

    void delOrdersByOid(Integer oid);              //删除订单

    void insertOrdersByOid(Integer uid,Integer mid,String order_time);               //添加订单

    //关联查询
    List<Orders> getAll();       //根据订单ID查询

    List<Orders> selectByuid (Integer uid);
}
