package me.yevgnenll.racing.validator;

public class NameValidator {

	private static final int MIN_NAME_LENGTH = 1;
	private static final int MAX_NAME_LENGTH = 5;
	private static final String NAME_SPLIT_TOKEN = ",";

	public static void validate(String names) {
		checkValidationName(names);
	}

	protected static void checkValidationName(String names) {
		for (String name : names.split(NAME_SPLIT_TOKEN)) {
			isLongerThan(name);
		}
	}

	private static boolean isLongerThan(String name) {
		if (name.length() > MAX_NAME_LENGTH || name.length() < 1) {
			throw new IllegalArgumentException("각 이름은 " + MIN_NAME_LENGTH + "자 이상, " +
				MAX_NAME_LENGTH + "자 이하여야 합니다.");
		}
		return false;
	}
}
