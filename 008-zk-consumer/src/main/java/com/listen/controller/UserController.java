package com.listen.controller;

import com.listen.domain.User;
import com.listen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 李松
 * 2020/7/16
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/user/count")
    public Object userCount() {
        Integer allUserCount = userService.queryAllUserCount();
        return "AllUserCount:" + allUserCount;
    }

    @RequestMapping("/user/detail")
    public String userCount(Integer id, Model model) {
        User user = userService.queryUserById(id);
        model.addAttribute("user", user);
        return "detail";
    }
}
