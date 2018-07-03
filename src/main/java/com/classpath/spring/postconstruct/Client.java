package com.classpath.spring.postconstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = (CustomerService)context.getBean("customerService");
		((AbstractApplicationContext)context).registerShutdownHook();
	}

}
