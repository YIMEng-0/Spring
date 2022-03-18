package com.luobin.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;


/**
 * @author Doraemon
 * @date 2022/3/18 5:08 下午
 * @version 1.0
 */

/**
 * Configuration 就是一个标志
 *  标志这个类是一个 Spring 核心配置类
 *      其思想就是既然 xml 太麻烦，那就不同 xml 进行配置了，但是该有的配置还是需要有的，配置到什么地方呢？创造出来的配置类
 *      可以放置一些简单的配置；
 */
// 申明这是一个配置文件
@Configuration
// <context:component-scan base-package="com.luobin"></context:component-scan>
@ComponentScan("com.luobin") // 进行注解的扫描

// import 总的配置加载分配置文件
@Import(DataSourceConfiguration.class)
public class SpringConfiguration {

}
