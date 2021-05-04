package me.yevgnenll.racing;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

	private static final String CAR_NAME_SPLIT_TOKEN = ",";
	private final List<Car> racingCars;
	private final int count;

	public CarFactory(String userInput, int count) {
		this.count = count;
		racingCars = generateCars(userInput);
	}

	public Cars getCars() {
		return new Cars(racingCars);
	}

	public int getCount() {
		return count;
	}

	private List<Car> generateCars(String carNames) {
		List<Car> racingCars = new ArrayList<>();
		for (String name : carNames.split(CAR_NAME_SPLIT_TOKEN)) {
			racingCars.add(new Car(name));
		}
		return racingCars;
	}

}
