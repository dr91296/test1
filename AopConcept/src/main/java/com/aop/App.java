package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		

		PaymentService service  = context.getBean("payment",PaymentService.class);
		
		service.makePayment();

	}

}
