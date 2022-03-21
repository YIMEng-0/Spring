package com.luobin.dao.impl;

import com.luobin.dao.UserDao;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author Doraemon
 * @date 2022/3/17 8:04 下午
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {

    /**
     * 没有构造方法的话，jvm 会自动的进行无参构造的，此时自己写了无参数构造，就会使用自己的构造器创建对象
     */
    public UserDaoImpl() {
        System.out.println("UserDaoImpl 对象此时被创建了");
    }

    @Override
    public void save() {
        System.out.println("UserDaoImpl save running...");
    }
}
