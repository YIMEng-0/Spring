package com.luobin.dao.impl;

import com.luobin.dao.UserDao;
import com.luobin.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author Doraemon
 * @date 2022/3/17 8:04 下午
 * @version 1.0
 */
public class UserDaoImpl implements UserDao {
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * 没有构造方法的话，jvm 会自动的进行无参构造的，此时自己写了无参数构造，就会使用自己的构造器创建对象
     */
    public UserDaoImpl() {
        System.out.println("UserDaoImpl 对象此时被创建了");
    }

    @Override
    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("UserDaoImpl save running...");
    }
}
