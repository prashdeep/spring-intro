package com.classpath.spring.di.jconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ServiceConfig.class)
public class AppConfig {
	
	/*
	 * <bean id="person" class="Person"></bean>
	 */
	@Bean(initMethod="customInit",destroyMethod="customDestroy",  name="person" )
	public Person getPerson() {
		return new Person();
	}
	

}
