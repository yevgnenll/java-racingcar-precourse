package me.yevgnenll.racing;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private final List<Car> carList;

	public Cars(List<Car> carList) {
		this.carList = carList;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public List<String> getCarNames() {
		List<String> result = new ArrayList<>();
		for (Car car : carList) {
			result.add(car.getName());
		}
		return result;
	}
}
