package com.luobin.service;

import com.luobin.pojo.Books;

import java.util.List;

/**
 * @author Doraemon
 * @date 2022/3/21 7:53 下午
 * @version 1.0
 */
public interface BookService {
    int addBook(Books books);

    // 删除一本书
    int deleteBookById(int id);

    // 修改一本书
    int updateBook(Books book);

    // 查询一本书
    Books queryBookById(int id);

    // 查询全部的书
    List<Books> queryAllBooks();
}
