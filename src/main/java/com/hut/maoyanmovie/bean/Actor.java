package com.hut.maoyanmovie.bean;

/**
 * @author asus
 * @data 2020/12/14
 */
public class Actor {

    private Integer aid;
    private Integer mid;
    private String director_name;
    private String director_photo;
    private String actor_name1;
    private String actor_photo1;
    private String actor_name2;
    private String actor_photo2;
    private String actor_name3;
    private String actor_photo3;
    private String actor_name4;
    private String actor_photo4;

    public Actor() {
        super();
    }

    public Actor(Integer aid, Integer mid, String director_name, String director_photo, String actor_name1, String actor_photo1, String actor_name2, String actor_photo2, String actor_name3, String actor_photo3, String actor_name4, String actor_photo4) {
        this.aid = aid;
        this.mid = mid;
        this.director_name = director_name;
        this.director_photo = director_photo;
        this.actor_name1 = actor_name1;
        this.actor_photo1 = actor_photo1;
        this.actor_name2 = actor_name2;
        this.actor_photo2 = actor_photo2;
        this.actor_name3 = actor_name3;
        this.actor_photo3 = actor_photo3;
        this.actor_name4 = actor_name4;
        this.actor_photo4 = actor_photo4;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public String getDirector_photo() {
        return director_photo;
    }

    public void setDirector_photo(String director_photo) {
        this.director_photo = director_photo;
    }

    public String getActor_name1() {
        return actor_name1;
    }

    public void setActor_name1(String actor_name1) {
        this.actor_name1 = actor_name1;
    }

    public String getActor_photo1() {
        return actor_photo1;
    }

    public void setActor_photo1(String actor_photo1) {
        this.actor_photo1 = actor_photo1;
    }

    public String getActor_name2() {
        return actor_name2;
    }

    public void setActor_name2(String actor_name2) {
        this.actor_name2 = actor_name2;
    }

    public String getActor_photo2() {
        return actor_photo2;
    }

    public void setActor_photo2(String actor_photo2) {
        this.actor_photo2 = actor_photo2;
    }

    public String getActor_name3() {
        return actor_name3;
    }

    public void setActor_name3(String actor_name3) {
        this.actor_name3 = actor_name3;
    }

    public String getActor_photo3() {
        return actor_photo3;
    }

    public void setActor_photo3(String actor_photo3) {
        this.actor_photo3 = actor_photo3;
    }

    public String getActor_name4() {
        return actor_name4;
    }

    public void setActor_name4(String actor_name4) {
        this.actor_name4 = actor_name4;
    }

    public String getActor_photo4() {
        return actor_photo4;
    }

    public void setActor_photo4(String actor_photo4) {
        this.actor_photo4 = actor_photo4;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "aid=" + aid +
                ", mid=" + mid +
                ", director_name='" + director_name + '\'' +
                ", director_photo='" + director_photo + '\'' +
                ", actor_name1='" + actor_name1 + '\'' +
                ", actor_photo1='" + actor_photo1 + '\'' +
                ", actor_name2='" + actor_name2 + '\'' +
                ", actor_photo2='" + actor_photo2 + '\'' +
                ", actor_name3='" + actor_name3 + '\'' +
                ", actor_photo3='" + actor_photo3 + '\'' +
                ", actor_name4='" + actor_name4 + '\'' +
                ", actor_photo4='" + actor_photo4 + '\'' +
                '}';
    }
}