package me.yevgnenll.racing;

public class OutputConsole {

	private static final String OUTPUT_MESSAGE = "실행 결과\n";

	public void racingProgress(Cars cars) {
		System.out.println(OUTPUT_MESSAGE);
		System.out.println(calculateString(cars));
	}

	public String calculateString(Cars cars) {
		StringBuilder result = new StringBuilder();
		for (Car car : cars.getCarList()) {
			result.append(car.toString())
				.append("\n");
		}
		return result.toString();
	}

}
