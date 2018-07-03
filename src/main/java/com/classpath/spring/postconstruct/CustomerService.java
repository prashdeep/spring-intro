package com.classpath.spring.postconstruct;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("customerService")
public class CustomerService {
	
	@PostConstruct
	public void afterConstruction() {
		System.out.println("Printed post construction..");
	}
	
	@PreDestroy
	public void beforeDestruction() {
		System.out.println("Printing before destruction..");
	}

}
