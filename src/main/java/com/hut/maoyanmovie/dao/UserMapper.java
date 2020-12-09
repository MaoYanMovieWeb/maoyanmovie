package com.hut.maoyanmovie.dao;

import com.hut.maoyanmovie.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author HP
 * @data 2020-12-09
 */
@Mapper
public interface UserMapper {

    User getUserByUid (Integer uid);

    void saveUserByUid (Integer uid);

    void deleteUserByUid (Integer uid);

    void updateUserByUid (Integer uid);
}
