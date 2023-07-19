package com.fssa.sparky.holiday;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CourseValidator {
	public static void main(String[] args) {
//		TODO : add a validator method which accept 
		Course course = new Course();
		validate(course);
	}

	public static boolean validate(Course course) {
		course.setCourseName("MobileHacking");
		course.setUserName("Pranaw");
		course.setEnrolledCourses("MobileHacking");
		course.setPassword("Pranaw@fssaB3c");

		nameValidator(course.getUserName());
		passwordValidator(course.getPassword());
		courseNameValidator(course.getCourseName());
		enrolledCourseValidator(course.getEnrolledCourses());
		return true;
	}

	public static boolean nameValidator(String name) throws IllegalArgumentException {

		if (name == null || "".equals(name.trim())) {
			throw new IllegalArgumentException("Name cannot be empty or null");
		}

		String nameregex = "^[A-Za-z]{2,30}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(name);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("Name should be in minimum 2 letters  and maximum 30 letters");

		}
		return true;

	}

	public static boolean passwordValidator(String password) throws IllegalArgumentException {

		if (password == null || "".equals(password.trim())) {
			throw new IllegalArgumentException("password cannot be empty or null");
		}

		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException(
					"password should contain atleast an upperCase and an lowerCase letter, and contains at least 8 characters and at most 20 characters. special characters allowed :  !@#$%&*()-+=^.");

		}
		return true;

	}

	public static boolean courseNameValidator(String coursename) throws IllegalArgumentException {
		if (coursename == null || "".equals(coursename.trim())) {
			throw new IllegalArgumentException("Course Name  cannot be empty or null");
		}

		String nameregex = "^[A-Za-z]{2,25}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(coursename);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException("Course Name should be in minimum 2 letters  and maximum 25 letters");

		}
		return true;

	}

	public static boolean enrolledCourseValidator(String[] courseToAdd) throws IllegalArgumentException {
		if (courseToAdd == null || ("".equals(courseToAdd[0]))) {
			throw new IllegalArgumentException("Enrolled Course cannot be empty or null");
		}
		String nameregex = "^[A-Za-z]{2,30}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(courseToAdd[0]);
		Boolean isMatch = matcher.matches();

		if (!isMatch) {
			throw new IllegalArgumentException(
					"Enrolled Course Name should be in minimum 2 letters  and maximum 30 letters");

		}
		return true;

	}

}
