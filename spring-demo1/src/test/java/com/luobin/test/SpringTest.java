package com.luobin.test;

import com.luobin.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Doraemon
 * @date 2022/3/17 8:24 下午
 * @version 1.0
 */
public class SpringTest {
    @Test
    // 测试 scope 属性
    public void test1() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao)app.getBean("userDao");

        /**
         * com.luobin.dao.impl.UserDaoImpl@51e2adc7
         * com.luobin.dao.impl.UserDaoImpl@51e2adc7
         * 此时在配置文件中没有配置，默认创建出来的对象只有一个
         *
         * com.luobin.dao.impl.UserDaoImpl@3cb1ffe6
         * com.luobin.dao.impl.UserDaoImpl@3dfc5fb8
         * 配置文件经过了修改，创建出了多个对象
         *
         */
        System.out.println(userDao1);
    }
}
