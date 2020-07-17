package com.listen.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.listen.bean.UserAddress;
import com.listen.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Service	//暴露服务
@Component
public class UserServiceImpl implements UserService {
	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....old...");
		UserAddress address1 = new UserAddress(1, "北京市", "1", "老李", "001-12345678", "Y");
		UserAddress address2 = new UserAddress(2, "深圳市", "1", "老王", "010-12345678", "N");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(address1,address2);
	}

}
