package com.luobin.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

/**
 * @author Doraemon
 * @date 2022/3/18 12:10 下午
 * @version 1.0
 */
public class DataSourceTest {
    @Test
    // 测试手动创建 c3p0 数据源
    public void test() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass("com.mysql.jdbc.Driver");

        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/data");
        dataSource.setUser("root");
        dataSource.setPassword("9842213764");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    // 测试手动创建 druid 数据源
    public void test2() throws Exception {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        dataSource.setUrl("jdbc:mysql://localhost:3306/data");
        dataSource.setUsername("root");
        dataSource.setPassword("9842213764");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    // 按照抽取配置文件的形式配置数据连接池
    // 前面使用了硬编码的形式，不是特别的好，这里将相关参数配置到文件中，直接读取配置文件即可
    public void test3() throws Exception {
        // 使用 bundle 的形式配置数据库
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    // 使用 Spring 容器产生数据源对象，前面的数据源对象是我们自己创建的，在 Spring 框架中，可以交给 Spring 进行创建，解耦合
    public void test4() throws Exception {
        // 读取配置文件，找到让 Spring 创建好的对象，这个对象相关的内容已经注入好了，拿来直接使用即可
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 拿到 Spring 帮我们创建好的对象即可，我们直接使用
        DataSource dataSource = (DataSource) app.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
