package com.cebbank.liuxiaoming.c13.dao.interfaceForDB;


import com.cebbank.liuxiaoming.c13.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by liuxiaoming on 20/9/16
 */
@Repository
public interface RegisterDao {
    //注册用户
    public Integer registerUser(User user);
}
