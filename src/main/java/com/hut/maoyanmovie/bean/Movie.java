package com.hut.maoyanmovie.bean;

/**
 * @author asus
 * @data 2020/12/8
 */

public class Movie {

    private Integer movie_id;
    private String movie_time;
    private String movie_type;
    private String movie_information;
    private String movie_region;
    private String movie_photo;
    private String movie_score;
    private String movie_money;

    public Movie() {
        super();
    }

    public Movie(Integer movie_id, String movie_time, String movie_type,
                 String movie_information, String movie_region,
                 String movie_photo, String movie_score, String movie_money) {
        this.movie_id = movie_id;
        this.movie_time = movie_time;
        this.movie_type = movie_type;
        this.movie_information = movie_information;
        this.movie_region = movie_region;
        this.movie_photo = movie_photo;
        this.movie_score = movie_score;
        this.movie_money = movie_money;
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_time() {
        return movie_time;
    }

    public void setMovie_time(String movie_time) {
        this.movie_time = movie_time;
    }

    public String getMovie_type() {
        return movie_type;
    }

    public void setMovie_type(String movie_type) {
        this.movie_type = movie_type;
    }

    public String getMovie_information() {
        return movie_information;
    }

    public void setMovie_information(String movie_information) {
        this.movie_information = movie_information;
    }

    public String getMovie_region() {
        return movie_region;
    }

    public void setMovie_region(String movie_region) {
        this.movie_region = movie_region;
    }

    public String getMovie_photo() {
        return movie_photo;
    }

    public void setMovie_photo(String movie_photo) {
        this.movie_photo = movie_photo;
    }

    public String getMovie_score() {
        return movie_score;
    }

    public void setMovie_score(String movie_score) {
        this.movie_score = movie_score;
    }

    public String getMovie_money() {
        return movie_money;
    }

    public void setMovie_money(String movie_money) {
        this.movie_money = movie_money;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", movie_time='" + movie_time + '\'' +
                ", movie_type='" + movie_type + '\'' +
                ", movie_information='" + movie_information + '\'' +
                ", movie_region='" + movie_region + '\'' +
                ", movie_photo='" + movie_photo + '\'' +
                ", movie_score='" + movie_score + '\'' +
                ", movie_money='" + movie_money + '\'' +
                '}';
    }
}