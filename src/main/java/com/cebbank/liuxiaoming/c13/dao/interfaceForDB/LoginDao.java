package com.cebbank.liuxiaoming.c13.dao.interfaceForDB;


import com.cebbank.liuxiaoming.c13.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by liuxiaoming on 20/9/16
 */
@Repository
public interface LoginDao {
    //通过用户名和密码验证用户
    public User queryUserByUserNameAndPwd(User user);
    //通过用户名查询用户
    public User queryUserByUserName(String userName);
}
