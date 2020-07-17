package com.listen.web;

import com.listen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 李松
 * 2020/7/15
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user/count")
    public Object userCount() {
        Integer allUserCount = userService.queryAllUserCount();
        return "用户总人数：" + allUserCount;
    }

}
