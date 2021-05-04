package me.yevgnenll.racing;

public class OutputConsole {

	private static final String OUTPUT_MESSAGE = "\n실행 결과";
	private static final String WINNER_MESSAGE = "가 최종 우승했습니다.";

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

	public void printWinner(Cars cars) {
		StringBuilder winnerMessage = new StringBuilder(String.join(", ", cars.getCarNames()));
		winnerMessage.append(WINNER_MESSAGE);
		print(winnerMessage.toString());
	}

	private void print(String message) {
		System.out.println(message);
	}

}
