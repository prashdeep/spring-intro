package com.classpath.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer customer = context.getBean("customer", Customer.class);
		Pizza pizza = customer.orderPizza();
		System.out.println(pizza);
	}
}
