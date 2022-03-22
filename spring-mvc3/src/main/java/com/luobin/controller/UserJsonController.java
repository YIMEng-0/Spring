package com.luobin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luobin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Doraemon
 * @date 2022/3/21 2:43 下午
 * @version 1.0
 */

@Controller
public class UserJsonController {

    @RequestMapping(value = "/j1", produces = "application/json;charset=utf-8") // produces 为了解决乱码的问题
    @ResponseBody // 不会去视图解析器的流程，会直接返回一个 json 字符串 ，阻止前往视图解析器，只会返回 json 字符串
    public String json1() throws JsonProcessingException {
        // 导包 使用人家写好的东西，将对象封装成为 json 字符串即可
        ObjectMapper mapper = new ObjectMapper();


        User user = new User(101, "Jack", 100);
        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user1 = new User(101, "Jack", 100);
        User user2 = new User(101, "Jack", 100);
        User user3 = new User(101, "Jack", 100);
        User user4 = new User(101, "Jack", 100);
        User user5 = new User(101, "Jack", 100);
        User user6 = new User(101, "Jack", 100);
        User user7 = new User(101, "Jack", 100);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);

        String str = mapper.writeValueAsString(userList);

        return str;

    }
}
