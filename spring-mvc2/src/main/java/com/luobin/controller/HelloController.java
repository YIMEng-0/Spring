package com.luobin.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Modifier;

/**
 * @author Doraemon
 * @date 2022/3/20 5:59 下午
 * @version 1.0
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //  业务代码
        String result = "HelloSpringMVC";
        mv.addObject("msg",result);

        // 视图代码
        mv.setViewName("test");

        return mv;
    }
}
