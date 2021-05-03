package me.yevgnenll.racing;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

	private final List<Car> racingCars;
	private final int count;

	public CarFactory(String carNames, int count) {
		this.count = count;
		racingCars = generateCars(carNames);
	}

	private List<Car> generateCars(String carNames) {
		List<Car> racingCars = new ArrayList<>();
		for (String name : carNames.split(",")) {
			racingCars.add(new Car(name));
		}
		return racingCars;
	}

	public List<Car> getCars() {
		return racingCars;
	}

	public int getCount() {
		return count;
	}

}
