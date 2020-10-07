package com.cebbank.liuxiaoming.c13.dao.impl;


import com.cebbank.liuxiaoming.c13.bean.User;
import com.cebbank.liuxiaoming.c13.dao.BaseDao;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDB.LoginDao;
import org.springframework.stereotype.Repository;


/**
 * 登录查询类
 *
 * @author liuxiaoming
 * @create 2020-09-16
 */
@Repository
public class LoginDaoImpl extends BaseDao implements LoginDao {


    @Override
    public User queryUserByUserNameAndPwd(User user) {
        String selectUser="select userName,userPwd from userinfo where userName=? and userPwd=?";
        User result = getObject(User.class, selectUser, user.getUserName(), user.getUserPwd());
        return result;
    }

    @Override
    public User queryUserByUserName(String userName) {
        String selectUser = "select userName from userinfo where userName=?";
        User result = getObject(User.class, selectUser, userName);
        return result;
    }
}
