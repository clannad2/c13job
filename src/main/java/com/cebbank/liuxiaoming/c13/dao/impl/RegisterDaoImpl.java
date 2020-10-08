package com.cebbank.liuxiaoming.c13.dao.impl;


import com.cebbank.liuxiaoming.c13.bean.User;
import com.cebbank.liuxiaoming.c13.dao.BaseDao;
import com.cebbank.liuxiaoming.c13.dao.interfaceForDao.RegisterDao;
import org.springframework.stereotype.Repository;

/**
 * 注册查询类
 *
 * @author liuxiaoming
 * @create 2020-09-16
 */
@Repository
public class RegisterDaoImpl extends BaseDao implements RegisterDao {


    @Override
    public Integer registerUser(User user) {
            String registerUser = "insert into userinfo(`userName`,`userPwd`,`userEmail`,`userPhone`) values(?,?,?,?)";
            int rows = update(registerUser,user.getUserName(),user.getUserPwd(),user.getUserEmail(),user.getUserPhone());
            return rows;
    }
}
