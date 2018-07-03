package com.classpath.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomInitClient {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = context.getBean("student", Student.class);
		((AbstractApplicationContext)context).registerShutdownHook();
		

	}
}
