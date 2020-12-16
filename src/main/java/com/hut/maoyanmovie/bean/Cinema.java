package com.hut.maoyanmovie.bean;

/**
 * @author HP
 * @data 2020-12-16
 */
public class Cinema {
    private Integer cid;
    private String cinema_name;
    private String cinema_address;

    public Integer getCid() {
        return cid;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "cid=" + cid +
                ", cinema_name='" + cinema_name + '\'' +
                ", cinema_address='" + cinema_address + '\'' +
                '}';
    }

    public Cinema() {
        super();
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
    }

    public String getCinema_address() {
        return cinema_address;
    }

    public void setCinema_address(String cinema_address) {
        this.cinema_address = cinema_address;
    }

    public Cinema(Integer cid, String cinema_name, String cinema_address) {
        this.cid = cid;
        this.cinema_name = cinema_name;
        this.cinema_address = cinema_address;
    }
}
