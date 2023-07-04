package com.fssa.sparky.holiday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValidator {
	
	public static void main(String[] args) {
		TestValidator test = new TestValidator();
		test.testValidName();
		test.testPasswordValidator();
		test.testCourseName();
		test.testEnrolledCourse();
		
		test.invalidEnrolledCourse();
		test.invalidPassword();
		test.invalidCourseName();
		test.invalidUserName();
	}
	

// valid Username

	@Test
	 void testValidName() {
		Assertions.assertTrue(CourseValidator.nameValidator("Pranaw"));
	}
//  valid CourseName

	@Test
	 void testCourseName() {
		Assertions.assertTrue(CourseValidator.courseNameValidator("MobileHacking"));
	}

//  valid Password

	@Test
	void testPasswordValidator() {
		Assertions.assertTrue(CourseValidator.passwordValidator("Pranaw@fssaB3c"));
	}
//  valid EnrolledCourse

	@Test
	void testEnrolledCourse() {
		String arr[] = { "MobileHacking" };
		Assertions.assertTrue(CourseValidator.enrolledCourseValidator(arr));
	}
	
	@Test
	 void invalidUserName() {
		Assertions.assertEquals(false, CourseValidator.nameValidator("   "));
	}
	@Test
	 void invalidCourseName() {
		Assertions.assertEquals(false, CourseValidator.courseNameValidator("   "));
	}
	@Test
	 void invalidPassword() {
		Assertions.assertEquals(false, CourseValidator.passwordValidator("   "));
	}
	@Test
	 void invalidEnrolledCourse() {
		String arr[] = { "  " };
		Assertions.assertEquals(false, CourseValidator.enrolledCourseValidator(arr));
	}

}