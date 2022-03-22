package com.luobin.dao;

import com.luobin.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Doraemon
 * @date 2022/3/21 7:31 下午
 * @version 1.0
 */
public interface BookMapper {
    // 增加一本书
    int addBook(Books books);

    // 删除一本书
    int deleteBookById(@Param("bookId") int id);

    // 修改一本书
    int updateBookById(Books book);

    // 查询一本书
    Books queryBookById(@Param("bookId")  int id);

    // 查询全部的书
    List<Books> queryAllBooks();
}
