package com.cebbank.liuxiaoming.c13.dao.interfaceForDao;

import com.cebbank.liuxiaoming.c13.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    //通过用户名和密码验证用户
    public User queryUserByUserNameAndPwd(User user);
    //通过用户名查询用户
    public User queryUserByUserName(String userName);
    //注册用户
    public Integer registerUser(User user);
    //更新用户账户余额
    public Integer updateBalance(Integer userId,Float filmPrice);
    //根据用户id查询当前余额
    public Float queryBalanceByUserId(Integer userId);
}
