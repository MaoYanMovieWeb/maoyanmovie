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
@Repository
public interface OrdersMapper {
    List<Orders> getOrdersByOid(Integer oid);

}
