package com.cebbank.liuxiaoming.c13.service.interfaceforservice;


import com.cebbank.liuxiaoming.c13.bean.User;
import org.springframework.stereotype.Service;

/**
 * 用户登录服务类接口
 *
 * @author liuxiaoming
 * @create 2020-09-16
 */

public interface UserService {
    //登录
    public User login(User user);
    //注册
    public Boolean register(User user);
    //判断用户是否已注册
    public Boolean ifExist(String userName);

}
