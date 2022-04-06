package com.luobin.controller;

import com.luobin.pojo.Books;
import com.luobin.service.BookService;
import com.luobin.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Doraemon
 * @date 2022/3/21 8:46 下午
 * @version 1.0
 */
@Controller // 这是一个 Controller 类
@RequestMapping("/book") // 将请求进行映射 http://localhost:8080/ssm-build/book/
public class BookController {
    //=================================查询所有书籍

    //Controller 调用 service 层
    @Autowired // 进行根据类型的依赖注入 下面的 Qualifier 根据类型创建出来的 BookServiceImpl 进行对象的注入 多态的一种实现
    @Qualifier("BookServiceImpl") // 注入的兑现是 BookServiceImpl 类产生的对象 ；接口的引用指向实现类； 面向接口编程，只是可以使用接口中存在的方法，多态的一种体现
    private BookService bookService; // 使用面向接口进行编程，规定了必须实现了什么，而不是怎么实现的；


    // 查询所有的书籍，并且返回到书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        // 直接调用业务层的代码即可，执行相关的方法，查询到结果
        List<Books> list = bookService.queryAllBooks();

        // 将查询到的数据返回到前端进行展示
        model.addAttribute("list", list);
        return "allBook";
    }

    //=================================添加书籍


    // 点击了新增按钮，进行的页面跳转实现
    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    /**
     * 下面一段代码的执行逻辑是这样的：
     *      1、前端访问增加书籍，从上面的 /toAddBook 页面 跳转到 /addBook 页面 ；
     *      2、使用服务层的 bookService 对象调用服务方法 addBook() ；服务层的对象使用 Spring 创建出来，注入的是 ServiceImpl 对象 ,Service 接口指向实现类体现出来了多态
     *      3、bookService 对象调用具体的方法，这个方法里面和 BookMapper 接口进行绑定，Mapper 接口中只有方法的定义；
     *      4、Mapper 接口 里面定义的方法与BookMapper.xml 进行关联， BookMapper.xml 里面书写SQL 与数据库打交道返回数据；
     * @param books
     * @return
     */
    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        // 在前端会传递三个参数，封装成为 book
        bookService.addBook(books);
        System.out.println(books);

        return "redirect:/book/allBook";
    }


    // 跳转到修改页面
    // 为什么需要先跳转到这个位置？
    // 跳转过来是为了查询到数据，在下面的 uodateBook 中进行数据的回显操作
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Books books = bookService.queryBookById(id);

        System.out.println(books);

        // 将这个 book 传递到修改的页面，数据携带到那个界面
        model.addAttribute("book", books);
        return "updateBook";
    }

    //=================================修改书籍

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Books book) {
        System.out.println(book);
        bookService.updateBook(book);
        Books books = bookService.queryBookById(book.getBookID());

        // 携带数据回去
        model.addAttribute("books", books);

        // 重定向到首页
        return "redirect:/book/allBook";
    }

    //=================================删除书籍
    // 将数据
    @RequestMapping("/del/{bookId}") // 接收前端传递回来的参数 @PathVariable ，传递进去，执行相关的方法，执行相关的 sql 语句
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
}