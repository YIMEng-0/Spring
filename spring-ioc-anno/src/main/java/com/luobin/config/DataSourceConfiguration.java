package com.luobin.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @author Doraemon
 * @date 2022/3/18 5:29 下午
 * @version 1.0
 */

// <context:property-placeholder location="classpath:jdbc.properties"/>
// 这个配置文件是属性配置文件，将属性配置文件的 key value 加载到 Spring 中，到时候可以取出来相关的变量，进行值的注入
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {

    // 读取配置文件，进行参数值的注入，在这里需要使用 ${} 将参数让 Spring 进行保管，放到某个存储的数据结构中，在使用的时候取出来即可
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean("dataSource")  //Spring会将当前方法的返回值以指定名称存储到Spring容器中
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
