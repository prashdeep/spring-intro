package com.classpath.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeClientExample {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnectionFactory obj1 = context.getBean("dbConnectionFactory", DBConnectionFactory.class);
		DBConnectionFactory obj2 = context.getBean("dbConnectionFactory", DBConnectionFactory.class);
		
		System.out.println("Singleton for DBConnectionFactory >> "+(obj1 == obj2));
		
		DBConnection connection1 = context.getBean("dbConnection", DBConnection.class);
		DBConnection connection2 = context.getBean("dbConnection", DBConnection.class);
		
		System.out.println("Singleton for DBConnection >> "+(connection1 == connection2));
		
		
	}

}
