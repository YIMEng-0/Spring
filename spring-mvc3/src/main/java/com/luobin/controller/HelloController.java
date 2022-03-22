package com.luobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Doraemon
 * @date 2022/3/20 8:06 下午
 * @version 1.0
 */
// cController 代表这个类是会被 Spring 进行托管的，控制器
@Controller// 处理请求并且返回一个 Model and View
public class HelloController {

    // 这个是经过了 Spring MVC 处理之后到达的请求路径，在 浏览器输入了 http://localhost:8080/spring-mvc3/hello 之后会自动的执行这个代码
    @RequestMapping("/hello")
    public String hello(Model model) {
        // 封装数据
        // model 就是向着模型中添加的数值，可以直接在 jsp 页面取出来并且进行渲染
        model.addAttribute("msg", "HelloSpringMVCAnnotation");

        return "test"; // 会被视图解析器进行处理,跳转到 test.jsp 相当于一个跳转页面，在配置文件中会进行自动的拼接
    }
}

/**
 * 上面代码的执行逻辑就是，获取到 经过 Spring MVC 处理的请求，让请求到达这里，然后执行相关的逻辑
 * 使用 return 转换到对应的页面即可
 * 前面写的配置文件都是固定的，都是不需要要写的
 * 处理一个 Servlet 请求简化成为了只需要书写 Controller 即可
 *
 * 基于接口开发中，每次的一个请求就需要一个类进行处理，十分麻烦，还要配置文件中写 bean 不建议使用
 */