import com.luobin.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Doraemon
 * @date 2022/3/18 10:08 下午
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");

        // 容器里面已经将 UserDao UserService 两个对象创建了，这里直接取到创建好的对象调用相关的方法即可；
        userService.save();
    }
}
