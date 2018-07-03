package com.classpath.spring.di.jconfig;

import org.springframework.stereotype.Component;

@Component("perosn")

public class Person {
	
	public void customInit() {
		System.out.println("Custom init method..");
	}

	
	public void customDestroy() {
		System.out.println("Custom destroy method ..");
	}
	public String getName() {
		return "Pradeep";
	}

}
