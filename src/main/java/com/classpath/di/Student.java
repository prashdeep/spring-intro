package com.classpath.di;

public class Student {
	
	private CollegeService collegeService;
	
	

	public CollegeService getCollegeService() {
		return collegeService;
	}

	public void setCollegeService(CollegeService collegeService) {
		this.collegeService = collegeService;
	}

	public Student(College college) {
		this.collegeService = college;
	}
	
	public void applyLeave(int days) {
		collegeService.applyForLeave(days);
	}

}
