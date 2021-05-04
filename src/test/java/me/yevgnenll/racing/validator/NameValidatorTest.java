package me.yevgnenll.racing.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import me.yevgnenll.racing.validator.NameValidator;

public class NameValidatorTest {

	@Test
	@DisplayName(value = "입력된 자동차의 이름은 5글자 이내여야 한다")
	void lessThan5() {
		assertThrows(IllegalArgumentException.class,
			() -> NameValidator.validate("kaki,5length,zeze"));
	}

}
