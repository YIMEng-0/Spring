package com.luobin.factory;

import com.luobin.dao.UserDao;
import com.luobin.dao.impl.UserDaoImpl;

/**
 * @author Doraemon
 * @date 2022/3/17 8:51 下午
 * @version 1.0
 */
public class StaticFactory {
    // 使用静态工厂创建 Bean 对象
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
