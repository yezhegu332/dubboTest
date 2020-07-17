package com.listen.dubbo;

import com.listen.domain.User;

/**
 * 李松
 * 2020/7/15
 */
public interface UserService {
    /*
    * 获取用户总人数
    */
    Integer queryAllUserCount();

    User queryUserById(Integer id);
}
