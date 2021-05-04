package me.yevgnenll.racing;

public class OutputConsole {

	private static final String OUTPUT_MESSAGE = "\n실행 결과";

	public void resultMessage() {
		print(OUTPUT_MESSAGE);
	}

	public void printDrivingCars(Cars cars) {
		print(calculateString(cars));
	}

	public String calculateString(Cars cars) {
		StringBuilder result = new StringBuilder();
		for (Car car : cars.getCarList()) {
			result.append(car.toString())
				.append("\n");
		}
		return result.toString();
	}

	private void print(String message) {
		System.out.println(message);
	}

}
