package com.luobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Doraemon
 * @date 2022/3/21 10:54 上午
 * @version 1.0
 */

@Controller
public class ControllerTest3 {
    @RequestMapping("/1")
    public String test(Model model) {

        model.addAttribute("","");

        return "test";
    }
}
