package com.cebbank.liuxiaoming.c13.dao.impl;

import com.cebbank.liuxiaoming.c13.bean.User;
import com.cebbank.liuxiaoming.c13.dao.BaseDao;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDao implements UserDao {
    @Override
    public User queryUserByUserNameAndPwd(User user) {
        String selectUser="select * where userName=? and userPwd=?";
        User result = getObject(User.class, selectUser, user.getUserName(), user.getUserPwd());
        return result;
    }

    @Override
    public User queryUserByUserName(String userName) {
        String selectUser = "select * from userinfo where userName=?";
        User result = getObject(User.class, selectUser, userName);
        return result;
    }

    @Override
    public Integer registerUser(User user) {
        String registerUser = "insert into userinfo(`userName`,`userPwd`,`userEmail`,`userPhone`) values(?,?,?,?)";
        int rows = update(registerUser,user.getUserName(),user.getUserPwd(),user.getUserEmail(),user.getUserPhone());
        return rows;
    }

    @Override
    public Integer updateBalance(Integer userId, Float filmPrice) {
        String updateItem = "update userinfo set userBalance = userBalance-? where userId = ?";
        int update = update(updateItem, filmPrice, userId);
        return update;
    }
}
