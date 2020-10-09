package com.cebbank.liuxiaoming.c13.service.impl;


import com.cebbank.liuxiaoming.c13.bean.User;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.UserDao;
import com.cebbank.liuxiaoming.c13.service.interfaceforservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务类
 *
 * @author liuxiaoming
 * @create 2020-09-16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public User login(User user) {
        User result = userDao.queryUserByUserNameAndPwd(user);
        return result;
    }

    @Override
    public Boolean register(User user) {
        Integer integer = userDao.registerUser(user);
        if (integer == 0){
            return false;
        }

        return true;
    }

    @Override
    public Boolean ifExist(String userName) {
        User user = userDao.queryUserByUserName(userName);
        if (user==null){
            return false;
        }

        return true;
    }
}
