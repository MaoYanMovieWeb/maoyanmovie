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
    private String order_time;

    public Orders() {
    }

    public Orders(Integer oid, Integer uid, Integer mid, String order_time) {
        this.oid = oid;
        this.uid = uid;
        this.mid = mid;
        this.order_time = order_time;
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

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", mid=" + mid +
                ", order_time='" + order_time + '\'' +
                '}';
    }

}