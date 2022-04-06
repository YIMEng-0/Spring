package com.luobin.service;

import com.luobin.dao.BookMapper;
import com.luobin.pojo.Books;

import java.util.List;

/**
 * @author Doraemon
 * @date 2022/3/21 7:53 下午
 * @version 1.0
 */
public class BookServiceImpl implements BookService{
    // 业务层调用 dao 层即可
    // 在前面的配置文件中，已经完成了 BookMapper 对象放在了 Spring 容器里面，相当于在 <文件中配置了对象的生成> 注入操作
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books book) {
        return bookMapper.updateBookById(book);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
