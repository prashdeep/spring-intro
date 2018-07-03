package com.classpath.spring.di.jconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class JavaConfigClient {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Person person = applicationContext.getBean("person", Person.class);
		System.out.println(person.getName());
		((AbstractApplicationContext)applicationContext).registerShutdownHook();
		
	}

}
