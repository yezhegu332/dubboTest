package com.listen.gmall;

import java.io.IOException;
import java.util.List;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.listen.bean.UserAddress;
import com.listen.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@EnableDubbo
public class MainApplication {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
		ioc.start();
		/*UserService userService = (UserService)ioc.getBean("userServiceImpl");
		List<UserAddress> list = userService.getUserAddressList("111");
		System.out.println(list);*/
		System.in.read();
	}

}
