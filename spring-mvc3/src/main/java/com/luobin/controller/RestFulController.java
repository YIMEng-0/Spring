package com.luobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Doraemon
 * @date 2022/3/21 11:36 上午
 * @version 1.0
 */
@Controller
public class RestFulController {
    // 原来的方式在 url 里面使用问号， = 传递参数类似http://localhost:8080/spring-mvc3/add?a=1&b=6
    // RestFul http://localhost:8080/spring-mvc3/add/a/b

    @GetMapping(value = "/add/{a}/{b}") // 限定使用 DELETE 的方式进行请求
    public String test1(@PathVariable int a,@PathVariable int b, Model model) {

        int res = a + b;
        model.addAttribute("msg", "结果为： " + res);

        return "test";
    }

    @PostMapping(value = "/add/{a}/{b}") // 限定使用 DELETE 的方式进行请求
    public String test2(@PathVariable int a,@PathVariable int b, Model model) {

        int res = a + b;
        model.addAttribute("msg", "结果为： " + res);

        return "test";
    }
}
