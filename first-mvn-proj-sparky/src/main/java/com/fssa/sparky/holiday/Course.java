package com.fssa.sparky.holiday;

import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private String password;
	private String userName;
//	static ArrayList<String> enrolledCourses = new ArrayList<String>();
	private String enrolledCourse[] = new String[5];

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String[] getEnrolledCourses() {
		return enrolledCourse;
	}

	public void setEnrolledCourses(String courseToAdd) {
		enrolledCourse[0] = courseToAdd;
	}

}
