package day19.practice;

import org.junit.jupiter.api.Assertions;

public class TestUserValidation {
	User userObj = new User();
	public void testUserName(UserValidator user) {
		Assertions.assertTrue(UserValidator.validate(userObj));
	}
}
