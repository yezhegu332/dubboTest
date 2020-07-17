package com.listen.gmall;

import java.io.IOException;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.listen.gmall.service.impl.OrderServiceImpl;
import com.listen.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@EnableDubbo
public class MainApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

		OrderService orderService = applicationContext.getBean(OrderService.class);

		orderService.initOrder("1");
		System.out.println("调用完成....");
		System.in.read();
	}

}
