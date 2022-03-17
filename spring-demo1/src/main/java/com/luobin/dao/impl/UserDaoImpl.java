package com.luobin.dao.impl;

import com.luobin.dao.UserDao;

/**
 * @author Doraemon
 * @date 2022/3/17 8:04 下午
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save running...");
    }
}
