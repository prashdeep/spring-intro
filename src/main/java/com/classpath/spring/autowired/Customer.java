package com.classpath.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired(required=true)
	@Qualifier("pizzahut")
	private PizzaDeliveryService pizzaDelivery;
	
	public Pizza orderPizza() {
		return pizzaDelivery.deliverPizza();
	}
	

}
