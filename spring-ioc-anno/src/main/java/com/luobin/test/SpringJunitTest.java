package com.luobin.test;

import com.luobin.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author Doraemon
 * @date 2022/3/18 5:48 下午
 * @version 1.0
 */

// 使用 Spring 提供的一个内核去跑，使用 Spring 的一个内核去跑
@RunWith(SpringJUnit4ClassRunner.class)

// 指定配置文件的位置
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest {
    @Autowired
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void test1() throws SQLException {
        System.out.println("userService 在下面");
        userService.save();
        System.out.println("dataSource: " + dataSource.getConnection());
        System.out.println();
    }
}
