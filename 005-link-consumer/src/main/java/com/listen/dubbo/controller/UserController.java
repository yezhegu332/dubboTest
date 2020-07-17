package com.listen.dubbo.controller;

import com.listen.domain.User;
import com.listen.dubbo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    @RequestMapping(value = "/user/count.do", produces = "text/html;charset=UTF-8")
    public Object userCount() {
        Integer allUserCount = userService.queryAllUserCount();
        return "用户总人数：" + allUserCount;
    }

    @RequestMapping("/user/detail.do")
    public String userDetail(Integer id, Model model) {
        User user = userService.queryUserById(id);
        model.addAttribute("user", user);
        return "detail";
    }
}
