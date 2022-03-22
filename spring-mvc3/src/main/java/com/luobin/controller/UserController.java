package com.luobin.controller;

import com.luobin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Doraemon
 * @date 2022/3/21 12:13 下午
 * @version 1.0
 */
@Controller
public class UserController {

    @GetMapping("/user/t1")
    public String test1(@RequestParam("username") String name, Model model) { // 用来接收前端传递过来的参数，都加上去 ResquestParam 为了表示出来，方便开发，好的习惯
        // 获取前端传递的参数
        System.out.println("接收到前端的 参数 为： " + name);
        // 结果传递到前端
        model.addAttribute("msg", name);

        return "test";
    }


    /**
     *  下面代码的执行流程
     *      前端进行参数的传递，假设前端传递的名字是和对象类里面的属性名字一样的话，执行了相关的方法，将对应的属性赋值到对象上面
     *      前端的名字和后断的名字不一样的话，对象属性赋值上面就会显示 null
     *
     *  保证表单中 name 属性 和 对象的属性名字一样的话，直接可以取出来使用
     * @param user
     * @return
     */
    // 前端接收一个 对象 ：id name age
    @GetMapping("/user/t2")
    public String test2(User user) {
        System.out.println(user);

        return "test";
    }

    @GetMapping("/user/t3")
    public String test3(ModelMap modelMap) {


        return "test";
    }
}