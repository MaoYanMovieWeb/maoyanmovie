package com.hut.maoyanmovie.service;

import com.hut.maoyanmovie.bean.User;

/**
 * @author HP
 * @data 2020-12-09
 */
public interface UserService {
    User getUserByUid (Integer uid);

    void saveUserByUid (String user_name,String user_password ,String user_tel);

    void deleteUserByUid (Integer uid);

    void updateUserByUid (User user);
}
