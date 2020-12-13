package com.hut.maoyanmovie.service.impl;

import com.hut.maoyanmovie.bean.User;
import com.hut.maoyanmovie.dao.UserMapper;
import com.hut.maoyanmovie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-09
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User loginUserByTel(String user_tel, String user_password) {
        return userMapper.loginUserByTel(user_tel, user_password);
    }

    @Override
    public void saveUserByUid(String user_name, String user_password, String user_tel) {
        userMapper.saveUserByUid(user_name, user_password, user_tel);
    }

    @Override
    public void deleteUserByUid(Integer uid) {

    }

    @Override
    public void updateUserByUid(User user) {

    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

}
