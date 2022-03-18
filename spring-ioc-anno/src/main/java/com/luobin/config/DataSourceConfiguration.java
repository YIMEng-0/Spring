package com.luobin.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author Doraemon
 * @date 2022/3/18 5:29 下午
 * @version 1.0
 */

// <context:property-placeholder location="classpath:jdbc.properties"/>
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {
    // 下面是没有办法解析 SEL 的，也就是不能解析 ${} 所以使用 @Value 的注入方式
    @Value("jdbc.driver")
    private String driver;

    @Value("jdbc.url")
    private String url;

    @Value("jdbc.username")
    private String username;

    @Value("jdbc.password")
    private String password;


    @Bean("dataSource") // Spring 会将当前方法的返回值用指定名称存储到 Spring 容器中
    public DataSource getDataSource() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();

        dataSource.setDriverClass(driver);

        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

        return dataSource;
    }

}
