package com.hut.maoyanmovie.bean;

/**
 * @author Cleanmoo
 * @data 2020/12/8
 *
 * 订单实体类
 */

public class Orders implements java.io.Serializable{
    private Integer oid;
    private Integer uid;
    private Integer mid;
    private Integer cid;
    private String order_time;
    private String user_name;
    private String movie_name;
    private String cinema_name;

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", mid=" + mid +
                ", cid=" + cid +
                ", order_time='" + order_time + '\'' +
                ", user_name='" + user_name + '\'' +
                ", movie_name='" + movie_name + '\'' +
                ", cinema_name='" + cinema_name + '\'' +
                '}';
    }

    public Orders(Integer oid, Integer uid, Integer mid, Integer cid, String order_time, String user_name, String movie_name, String cinema_name) {
        this.oid = oid;
        this.uid = uid;
        this.mid = mid;
        this.cid = cid;
        this.order_time = order_time;
        this.user_name = user_name;
        this.movie_name = movie_name;
        this.cinema_name = cinema_name;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public Orders() {
    }


    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }


}