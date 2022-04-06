import com.luobin.pojo.Books;
import com.luobin.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

/**
 * @author Doraemon
 * @date 2022/3/22 8:17 下午
 * @version 1.0
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");

        for (Books books : bookServiceImpl.queryAllBooks()) {
            System.out.println(books);
        }

    }
}
