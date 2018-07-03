package com.classpath.di;

public class Student {
	
	private College college;
	
	public Student(College college) {
		this.college = college;
	}
	
	public void applyLeave(int days) {
		college.applyForLeave(days);
	}

}
