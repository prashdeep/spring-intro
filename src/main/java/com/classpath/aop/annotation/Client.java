package com.classpath.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      
	      Student student = (Student) context.getBean("studentProxy");
	      student.getName();
	        
	   }
	}
