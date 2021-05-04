package me.yevgnenll.racing;

import java.util.Scanner;

public class UserInput {

	private static final String USER_INPUT_CAR_NAME_MESSAGE =
		"경주할 자동차의 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String USER_INPUT_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";

	private Scanner scanner = new Scanner(System.in);

	public CarFactory interactUser() {
		print(USER_INPUT_CAR_NAME_MESSAGE);
		String carNames = scanner.next();
		print(USER_INPUT_COUNT_MESSAGE);
		int count = scanner.nextInt();
		return new CarFactory(carNames, count);
	}

	private void print(String message) {
		System.out.println(message);
	}

}
