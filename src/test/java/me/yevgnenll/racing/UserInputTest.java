package me.yevgnenll.racing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserInputTest {

	@Test
	@DisplayName(value = "입력된 자동차의 이름은 5글자 이내여야 한다")
	void lessThan5() {
		UserInput userInput = new UserInput();

		assertThrows(IllegalArgumentException.class,
			() -> userInput.checkValidationName("kaki,5longer,zeze"));
	}

}
