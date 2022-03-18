package com.luobin.service.impl;

import com.luobin.dao.UserDao;
import com.luobin.service.UserService;

/**
 * @author Doraemon
 * @date 2022/3/17 9:11 下午
 * @version 1.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /**
     * 通过构造方法进行注入
     * @param userDao
     */
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    @Override
    public void save() {
        userDao.save();
    }

//    /**
//     * 通过 set 方法的依赖注入，将 UserDao 注入到 UserService 里面去
//     * @param userDao
//     */
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
}
