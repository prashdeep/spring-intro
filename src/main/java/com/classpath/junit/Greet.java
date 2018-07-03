package com.classpath.junit;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Greet {

	public String sayHello(String username) {
		if (username != null) {
			username = username.toUpperCase();
			return "Hi " + username;
		} else
			return "Hi Stranger";
	}

}
