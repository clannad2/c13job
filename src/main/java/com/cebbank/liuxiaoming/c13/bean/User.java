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
    @NotEmpty
    private String userName;
    private String userPwd;
    private String userPhone;
    @Email
    private String userEmail;

    private String userBalance;

    public User() {
    }

    public User(String userName, String userPwd, String userPhone, String userEmail, String userBalance) {
        this.userName = userName;
        this.userPwd = userPwd;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userBalance = userBalance;
    }

    public String getUserBalance() {
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

    public void setUserBalance(String userBalance) {
        this.userBalance = userBalance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPwd='" + userPwd + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userBalance='" + userBalance + '\'' +
                '}';
    }
}
