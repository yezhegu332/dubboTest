package com.listen.controller;

import com.listen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 李松
 * 2020/7/16
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService1;

    @Autowired
    private UserService userService2;

    @ResponseBody
    @RequestMapping("/user/count")
    public Object userCount() {
        Integer integer = userService1.queryAllUserCount();
        return "all user count ->" + integer;
    }

    @ResponseBody
    @RequestMapping("/user/count2")
    public Object userCount2() {
        Integer integer = userService2.queryAllUserCount();
        return "all user count ->" + integer;
    }
}
