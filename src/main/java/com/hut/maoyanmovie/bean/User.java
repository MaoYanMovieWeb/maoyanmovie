package com.hut.maoyanmovie.bean;

/**
 * @author HP
 * @data 2020-12-08
 */
public class User {
    private Integer uid;
    private String user_name;
    private String user_password;
    private String user_tel;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_tel='" + user_tel + '\'' +
                '}';
    }

    public User() {
        super();
    }

    public User(Integer uid, String user_name, String user_password, String user_tel) {
        this.uid = uid;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_tel = user_tel;
    }
}
