package com.classpath.di;

public class Client {
	
	public static void main(String[] args) {
		College college = new College();
		Student student = new Student(college);
		student.applyLeave(10);
	}

}
