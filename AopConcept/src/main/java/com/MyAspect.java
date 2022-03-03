package com;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before(value = "execution(* com.aop.service.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment statetd");
	}
	
	@After(value = "execution(* com.aop.service.PaymentServiceImpl.makePayment())")
	public void printAfter() {
		System.out.println("Payment done");
	}

}
