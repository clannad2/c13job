package com.cebbank.liuxiaoming.c13.bean;

/**
 * 电影票信息
 */
public class Film {
    //电影名称
    private String filmName;
    //电影价格
    private String filemPrice;
    //电影票剩余
    private String filmStock;
    //电影类型
    private String filmType;
    //电影主演
    private String filmRole;

    public Film() {
    }

    public Film(String filmName, String filemPrice, String filmStock, String filmType, String filmRole) {
        this.filmName = filmName;
        this.filemPrice = filemPrice;
        this.filmStock = filmStock;
        this.filmType = filmType;
        this.filmRole = filmRole;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getFilemPrice() {
        return filemPrice;
    }

    public String getFilmStock() {
        return filmStock;
    }

    public String getFilmType() {
        return filmType;
    }

    public String getFilmRole() {
        return filmRole;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setFilemPrice(String filemPrice) {
        this.filemPrice = filemPrice;
    }

    public void setFilmStock(String filmStock) {
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
                "filmName='" + filmName + '\'' +
                ", filemPrice='" + filemPrice + '\'' +
                ", filmStock='" + filmStock + '\'' +
                ", filmType='" + filmType + '\'' +
                ", filmRole='" + filmRole + '\'' +
                '}';
    }
}
