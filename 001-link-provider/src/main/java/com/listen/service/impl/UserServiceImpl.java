package com.listen.service.impl;

import com.listen.service.UserService;

/**
 * 李松
 * 2020/7/15
 */
public class UserServiceImpl implements UserService {
    @Override
    public Integer queryAllUserCount() {
        //调用数据持久层
        System.out.println("调用了queryAllUserCount");
        return 20;
    }
}
