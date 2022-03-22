package com.luobin.controller;

import com.luobin.pojo.Books;
import com.luobin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Doraemon
 * @date 2022/3/21 8:46 下午
 * @version 1.0
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //=================================查询所有书籍
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        // 因为只是对于所有的书籍进行查询，所以，这个里面是没有传递过来参数的
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list", list);
        return "allBook";
    }

    //=================================添加书籍
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        System.out.println(books);
        bookService.addBook(books);
        System.out.println(books);
        return "redirect:/book/allBook";
    }

    //=================================

    //=================================

    //=================================
}