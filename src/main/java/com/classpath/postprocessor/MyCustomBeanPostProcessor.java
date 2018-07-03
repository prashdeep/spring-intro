package com.classpath.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCustomBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("arg0 a"+arg0);
		System.out.println("arg1 a"+arg1);
		System.out.println("Came inside the postProcessor after initialization method");
		return arg0;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("arg0 b"+arg0);
		System.out.println("arg1 b"+arg1);
		System.out.println("Came inside the postProcessorBeforeInitialization method");
		return arg0;
	}

}
