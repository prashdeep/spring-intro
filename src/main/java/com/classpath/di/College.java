package com.classpath.di;

import java.util.HashMap;
import java.util.Map;

public class College implements CollegeService {
	
	public Map<Integer, String> getCollegeMap() {
		return collegeMap;
	}


	public void setCollegeMap(Map<Integer, String> collegeMap) {
		this.collegeMap = collegeMap;
	}


	private Map<Integer, String> collegeMap ;
	
	
	public void applyForLeave(int daysOfLeave) {
		System.out.println("Applying for "+daysOfLeave+ " vacation in the College class");
	}

}
