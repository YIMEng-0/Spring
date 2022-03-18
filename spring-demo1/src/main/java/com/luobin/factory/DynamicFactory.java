package com.luobin.factory;

import com.luobin.dao.UserDao;
import com.luobin.dao.impl.UserDaoImpl;

/**
 * @author Doraemon
 * @date 2022/3/17 9:01 下午
 * @version 1.0
 */
public class DynamicFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
