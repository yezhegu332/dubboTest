package com.listen.service.impl;

import com.listen.domain.User;
import com.listen.service.UserService;

/**
 * 李松
 * 2020/7/16
 */
public class UserServiceImpl1 implements UserService {
    @Override
    public Integer queryAllUserCount() {
        return 11;
    }

    @Override
    public User queryUserById(Integer id) {
        User user = new User(id,"猪八戒");
        return user;
    }
}
