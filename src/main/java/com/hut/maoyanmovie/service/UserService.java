package com.hut.maoyanmovie.service;

import com.hut.maoyanmovie.bean.User;

import java.util.List;

/**
 * @author HP
 * @data 2020-12-09
 */
public interface UserService {
    User loginUserByTel (String user_tel ,String user_password);

    void saveUserByUid (String user_name,String user_password ,String user_tel);

    void deleteUserByUid (Integer uid);

    void updateUserByUid (User user);

    List<User> selectAll ();

    Integer save_myself (Integer uid);

    void uploaduser_photo (Integer uid , String user_photo);

}
