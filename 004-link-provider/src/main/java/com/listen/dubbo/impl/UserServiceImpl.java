package com.listen.dubbo.impl;

import com.listen.domain.User;
import com.listen.dubbo.UserService;

/**
 * 李松
 * 2020/7/15
 */
public class UserServiceImpl implements UserService {
    @Override
    public Integer queryAllUserCount() {
        //调用数据持久层
        return 25;
    }

    @Override
    public User queryUserById(Integer id) {
        User user = new User(id,"孙悟空");
        return user;
    }
}
