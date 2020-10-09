package com.cebbank.liuxiaoming.c13.bean;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * 用户信息表
 *
 * @author liuxiaoming
 * @create 2020-09-16
 */
public class User {
    private Integer userId;
    @NotEmpty
    private String userName;
    private String userPwd;
    private String userPhone;
    @Email
    private String userEmail;

    private Float userBalance;

    public User() {
    }

    public User(Integer id, String userName, String userPwd, String userPhone, String userEmail, Float userBalance) {
        this.userId = id;
        this.userName = userName;
        this.userPwd = userPwd;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userBalance = userBalance;
    }

    public Integer getUserId() {
        return userId;
    }

    public Float getUserBalance() {
        return userBalance;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserBalance(Float userBalance) {
        this.userBalance = userBalance;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userId +
                ", userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userBalance=" + userBalance +
                '}';
    }
}
