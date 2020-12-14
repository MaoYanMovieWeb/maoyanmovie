package com.hut.maoyanmovie.dao;

import com.hut.maoyanmovie.bean.Actor;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author asus
 * @data 2020/12/14
 */

@Mapper
public interface ActorMapper {
    Actor getActor(Integer mid);
}
