package me.yevgnenll.racing;

import java.util.Scanner;

public class UserInput {

	private static final String USER_INPUT_CAR_NAME_MESSAGE =
		"경주할 자동차의 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String USER_INPUT_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";

	private Scanner scanner = new Scanner(System.in);

	public CarFactory interactUser() {
		String carNames = userInputCarNames();
		int count = userInputCount();
		return new CarFactory(carNames, count);
	}

	private String userInputCarNames() {
		print(USER_INPUT_CAR_NAME_MESSAGE);
		return scanner.next();
	}

	private int userInputCount() {
		print(USER_INPUT_COUNT_MESSAGE);
		int count = scanner.nextInt();
		while (count < 1) {
			print(USER_INPUT_COUNT_MESSAGE);
			count = scanner.nextInt();
		}
		return count;
	}

	private void print(String message) {
		System.out.println(message);
	}

}
