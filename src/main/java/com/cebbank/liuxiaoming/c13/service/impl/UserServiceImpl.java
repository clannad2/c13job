package com.cebbank.liuxiaoming.c13.service.impl;


import com.cebbank.liuxiaoming.c13.bean.User;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.LoginDao;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.RegisterDao;
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
    LoginDao loginDao;

    @Autowired
    RegisterDao registerDao;

    @Override
    public Boolean login(User user) {
        User result = loginDao.queryUserByUserNameAndPwd(user);
        if (result == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Boolean register(User user) {
        Integer integer = registerDao.registerUser(user);
        if (integer == 0){
            return false;
        }

        return true;
    }

    @Override
    public Boolean ifExist(String userName) {
        User user = loginDao.queryUserByUserName(userName);
        if (user==null){
            return false;
        }

        return true;
    }
}
