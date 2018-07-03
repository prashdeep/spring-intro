package com.classpath.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringClient {
	
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		Student student = context.getBean("student", Student.class);
		//student.applyLeave(12);
		//System.out.println(student.getAddress());
		//System.out.println(student.getAge());
		//Set<Course> setOfCourses = student.getCourses();
		//System.out.println(setOfCourses);
		//System.out.println(student.getPetNames());
		//System.out.println(((College)student.getCollegeService()).getCollegeMap());
		DataSource dataSource = context.getBean("dataSource" , DataSource.class);
		System.out.println(dataSource.getDriverClassName());
		
		
	}

}
