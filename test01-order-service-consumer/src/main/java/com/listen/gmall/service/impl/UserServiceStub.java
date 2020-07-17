package com.listen.gmall.service.impl;

import com.listen.bean.UserAddress;
import com.listen.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 李松
 * 2020/7/16
 */
public class UserServiceStub implements UserService {
    private final UserService userService;

    /*
    * 传入的是userService的远程代理对象
    */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub调用了");
        if(!StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
