package com.cebbank.liuxiaoming.c13.dao;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

/**
 * 数据库操作表
 *
 * @author liuxiaoming
 * @create 2020-09-13
 */
public class BaseDao {
    private static ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("springdb.xml");

    private static JdbcTemplate jt = ctx.getBean(JdbcTemplate.class);

    /**
     * 通用增删改操作
     * @param sql
     * @param args sql中占位符的个数应该与数组长度一致
     * @throws Exception
     */
    public int update(String sql, Object ...args) {
        int update = jt.update(sql, args);
        ctx.close();
        return update;
    }

    /**
     * 返回一个查询的对象
     * @param clazz
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public static <T> T getObject(Class<T> clazz,String sql,Object ...args){
        List<T> results = getList(clazz,sql,args);
        if (results.size()==0){
            return null;
        }
        return results.get(0);
    }

    /**
     * 返回多个查询的对象
     * @param clazz
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public static <T> List<T> getList(Class<T> clazz, String sql, Object ...args){
        RowMapper<T> rowMapper = new BeanPropertyRowMapper<T>(clazz);
        List<T> results = jt.query(sql, rowMapper,args);
        return results;
    }

//    /**
//     * 返回多个查询的对象
//     * @param clazz
//     * @param sql
//     * @param args
//     * @param <T>
//     * @return
//     */
//    public static <T> HashSet<T> getSet(Connection conn, Class<T> clazz, String sql, Object ...args){
//
//    }
}
