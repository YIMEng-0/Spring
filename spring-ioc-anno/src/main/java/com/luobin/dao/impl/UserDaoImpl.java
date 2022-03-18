package com.luobin.dao.impl;

import com.luobin.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Doraemon
 * @date 2022/3/18 3:24 下午
 * @version 1.0
 */

// <bean id="userDao" class="com.luobin.dao.impl.UserDaoImpl"></bean>
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("save running...");
    }
}
