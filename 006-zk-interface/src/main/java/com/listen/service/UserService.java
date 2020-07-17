package com.listen.service;

import com.listen.domain.User;

/**
 * 李松
 * 2020/7/16
 * 006-zk-interface
 */
public interface UserService {
    Integer queryAllUserCount();

    User queryUserById(Integer id);
}
