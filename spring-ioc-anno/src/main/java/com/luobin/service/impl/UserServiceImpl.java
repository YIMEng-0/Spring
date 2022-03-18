package com.luobin.service.impl;

import com.luobin.dao.UserDao;
import com.luobin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Doraemon
 * @date 2022/3/18 3:25 下午
 * @version 1.0
 */

/**
 *     <bean id="userService" class="com.luobin.service.impl.UserServiceImpl">
 *         <!--name setUserDao 的后面单词的前一个小写，表示使用 set 方法进行对象的注入，从哪儿个方法进行注入-->
 *         <!--ref 表示注入 具体的对象是什么-->
 *         <property name="userDao" ref="userDao"></property>
 *     </bean>
 *
 *     原来的创建对象以及对象的注入基于配置文件，为了简化开发，这里使用注解的形式
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    /**
     * 将普通的数值进行注入,所谓的注入就是赋值？减少相互之间的依赖关系，解耦合
     */
    @Value("${jdbc.driver}")
    private String driver;

    /**
     * Autowired 按照数据类型从 Spring 容器中进行匹配
     *
     * Qualifier 按照 id 值从容器中进行匹配，但是主要从此处的 Autowired 以及 Qualifier 结合使用才行
     *
     * 按照类写一个 Autowired  按照 id 写两个，两个注解都不能省略掉
     *
     * @Resource = Autowired + Qualifier
     */

    @Autowired// 自动注入
    @Qualifier("userDao") // 需要注入的 id @Autowired @ Qualifier 相当于 <property name="userDao" ref="userDao"></property>
    private UserDao userDao;

    // 使用 set 方法在 service 注入 dao
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        // 调用数据库的 save 方法
        userDao.save();

        System.out.println("driver 的数值是：" + driver);
    }
}