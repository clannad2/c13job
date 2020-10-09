package com.cebbank.liuxiaoming.c13.bean;

/**
 * 电影票信息
 */
public class Film {
    private Integer filmId;
    //电影名称
    private String filmName;
    //电影价格
    private Float filmPrice;
    //电影票剩余
    private Integer filmStock;
    //电影类型
    private String filmType;
    //电影主演
    private String filmRole;

    public Film() {
    }

    public Film(Integer filmId, String filmName, Float filmPrice, Integer filmStock, String filmType, String filmRole) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmPrice = filmPrice;
        this.filmStock = filmStock;
        this.filmType = filmType;
        this.filmRole = filmRole;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public Float getFilmPrice() {
        return filmPrice;
    }

    public Integer getFilmStock() {
        return filmStock;
    }

    public String getFilmType() {
        return filmType;
    }

    public String getFilmRole() {
        return filmRole;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setFilmPrice(Float filmPrice) {
        this.filmPrice = filmPrice;
    }

    public void setFilmStock(Integer filmStock) {
        this.filmStock = filmStock;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public void setFilmRole(String filmRole) {
        this.filmRole = filmRole;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + filmId +
                ", filmName='" + filmName + '\'' +
                ", filmPrice='" + filmPrice + '\'' +
                ", filmStock='" + filmStock + '\'' +
                ", filmType='" + filmType + '\'' +
                ", filmRole='" + filmRole + '\'' +
                '}';
    }
}
