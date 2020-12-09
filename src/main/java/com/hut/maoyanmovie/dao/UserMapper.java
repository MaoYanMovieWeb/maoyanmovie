package com.hut.maoyanmovie.dao;

import com.hut.maoyanmovie.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author HP
 * @data 2020-12-09
 */
@Mapper
public interface UserMapper {

    User getUserByUid (Integer uid);

    void saveUserByUid (String user_name,String user_password ,String user_tel);

    void deleteUserByUid (Integer uid);

    void updateUserByUid (User user);
}
