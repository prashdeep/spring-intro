package com.classpath.di;

public class Client {
	
	public static void main(String[] args) {
		College college = new College();
		NewCollege newCollege = new NewCollege();
		Student student = new Student(college);
		student.setCollegeService(newCollege);
		student.applyLeave(10);
	}

}
