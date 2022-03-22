package com.luobin.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Doraemon
 * @date 2022/3/20 8:06 下午
 * @version 1.0
 */

/**
 * @Controller用于标记一个类，使用他标记的类就是一个SpringMVC
 * Controller对象，即一个控制器类，Spring使用扫描机制查找应用程序中所有基于注解的控制器类。
 */

// @Controller
//@RequestMapping("") 写在类上面会存在一个目录等级
public class HelloController1有一些解释 {

    // 这个是经过了 Spring MVC 处理之后到达的请求路径，在 浏览器输入了 http://localhost:8080/spring-mvc3/hello 之后会自动的执行这个代码
    @RequestMapping("/hello")
    public String hello(Model model) {
        // 封装数据
        // model 就是向着模型中添加的数值，可以直接在 jsp 页面取出来并且进行渲染
        model.addAttribute("msg", "HelloSpringMVCAnnotation");

        return "test"; // 会被视图解析器进行处理,跳转到 test.jsp 相当于一个跳转页面，在配置文件中会进行自动的拼接
    }
}