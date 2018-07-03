package com.classpath.spring.autowired;

import org.springframework.stereotype.Component;

@Component("pizzahut")
public class PizzahutPizzaDelivery implements PizzaDeliveryService{

	public Pizza deliverPizza() {
		return new Pizza("Pizza-hut Pizza", 500);
	}

}
