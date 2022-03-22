package com.luobin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Doraemon
 * @date 2022/3/21 12:13 下午
 * @version 1.0
 */

/**
 * @Data ： 注在类上，提供类的get、set、equals、hashCode、toString等方法
 * @AllArgsConstructor ：注在类上，提供类的全参构造
 * @NoArgsConstructor ：注在类上，提供类的无参构造
 * @Setter ：注在属性上，提供 set 方法
 * @Getter ：注在属性上，提供 get 方法
 * @EqualsAndHashCode ：注在类上，提供对应的 equals 和 hashCode 方法
 * @Log4j/@Slf4j ：注在类上，提供对应的 Logger 对象，变量名为 log
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
}
