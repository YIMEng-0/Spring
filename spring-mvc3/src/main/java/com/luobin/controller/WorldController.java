package com.luobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Doraemon
 * @date 2022/3/21 10:14 上午
 * @version 1.0
 */
@Controller
public class WorldController {
    @RequestMapping("/world")
    public String world(Model model) {
        model.addAttribute("msg1","WorldWorld");

        return "world";
    }

    @RequestMapping("/world1")
    public String world1(Model model) {
        String string = "1111111111";

        model.addAttribute("msg1",string);

        return "world";
    }
    /**
     * s上面和下面的处理请求，并不是开发了多个网页，网页是可以复用的，只是里面的内容在不断的更新
     */
}
