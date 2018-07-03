package com.classpath.di;

import java.util.List;
import java.util.Set;

public class Student {
	
	private CollegeService collegeService;
	
	private String name;
	
	private int age;
	
	private Address address;
	
	private List<String> petNames;
	
	public List<String> getPetNames() {
		return petNames;
	}

	public void setPetNames(List<String> petNames) {
		this.petNames = petNames;
	}

	private Set<Course> courses;
	

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public CollegeService getCollegeService() {
		return collegeService;
	}

	public void setCollegeService(CollegeService collegeService) {
		this.collegeService = collegeService;
	}

	public Student(CollegeService college) {
		this.collegeService = college;
	}
	
	public void applyLeave(int days) {
		collegeService.applyForLeave(days);
	}

}
