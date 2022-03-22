package com.luobin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Doraemon
 * @date 2022/3/21 7:25 下午
 * @version 1.0
 */

/**
 * @Data 出了无参构造方法没有以外，其他的 get set 方法都是建立好的；
 * 加上去有参数的构造器，无参数的构造器没了
 * 加上其无参数构造器的注解
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
