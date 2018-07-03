package com.classpath.spring.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceClient {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DerivedClass derivedObj = context.getBean("derived", DerivedClass.class);
		derivedObj.baseClassMethod();
	}

}
