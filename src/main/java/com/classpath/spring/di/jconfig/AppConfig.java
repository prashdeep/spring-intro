package com.classpath.spring.di.jconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(ServiceConfig.class)
public class AppConfig {
	
	/*
	 * <bean id="person" class="Person"></bean>
	 */
	@Bean(initMethod="customInit",destroyMethod="customDestroy",  name="person" )
	@Scope(value="singleton")
	public Person getPerson() {
		return new Person();
	}
	

}
