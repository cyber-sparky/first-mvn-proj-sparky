package com.fssa.sparky.holiday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCourseProgress {
	
	public static void main(String[] args) {
		testValidName();
		testPasswordValidator();
		testCourseName();
		testEnrolledCourse();
		
		invalidEnrolledCourse();
		invalidPassword();
		invalidCourseName();
		invalidUserName();
	}
	

// valid Username

	@Test
	public static void testValidName() {
		Assertions.assertTrue(CourseValidator.nameValidator("Pranaw"));
	}
//  valid CourseName

	@Test
	public static void testCourseName() {
		Assertions.assertTrue(CourseValidator.courseNameValidator("MobileHacking"));
	}

//  valid Password

	@Test
	public static void testPasswordValidator() {
		Assertions.assertTrue(CourseValidator.passwordValidator("Pranaw@fssaB3c"));
	}
//  valid EnrolledCourse

	@Test
	public static void testEnrolledCourse() {
		String arr[] = { "MobileHacking" };
		Assertions.assertTrue(CourseValidator.enrolledCourseValidator(arr));
	}
	
	@Test
	public static void invalidUserName() {
		Assertions.assertEquals(false, CourseValidator.nameValidator("   "));
	}
	@Test
	public static void invalidCourseName() {
		Assertions.assertEquals(false, CourseValidator.courseNameValidator("   "));
	}
	@Test
	public static void invalidPassword() {
		Assertions.assertEquals(false, CourseValidator.passwordValidator("   "));
	}
	@Test
	public static void invalidEnrolledCourse() {
		String arr[] = { "  " };
		Assertions.assertEquals(false, CourseValidator.enrolledCourseValidator(arr));
	}

}