package com.hut.maoyanmovie.service;

import com.hut.maoyanmovie.bean.User;

/**
 * @author HP
 * @data 2020-12-09
 */
public interface UserService {
    User loginUserByTel (String user_tel ,String user_password);

    void saveUserByUid (String user_name,String user_password ,String user_tel);

    void deleteUserByUid (Integer uid);

    void updateUserByUid (User user);
}
