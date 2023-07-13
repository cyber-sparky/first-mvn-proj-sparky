package com.fssa.sparky.holiday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValidator {
	
	public static void main(String[] args) {
		TestValidator test = new TestValidator();
		test.validator();
	}
	
	void validator() {
		testValidName("Pra");
		testCourseName();
		testPasswordValidator();
		testEnrolledCourse();
		invalidUserName();
		invalidCourseName();
		invalidPassword();
		invalidEnrolledCourse();
	}

// valid Username

	@Test
	 void testValidName(String name) {
		Assertions.assertTrue(CourseValidator.nameValidator(name));
	}
//  valid CourseName

	@Test
	 void testCourseName(String ) {
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