package com.fssa.sparky.holiday;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCourseValidator {
	
	public static void main(String[] args) {
		TestCourseValidator test = new TestCourseValidator();
		test.validator();
	}
	
	void validator() {
		testValidName("Pra");
		testCourseName("MobileHacking");
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
	 void testCourseName(String courseName) {
		Assertions.assertTrue(CourseValidator.courseNameValidator(courseName));
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