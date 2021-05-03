package me.yevgnenll.racing;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

	private final List<Car> racingCars;
	private final int count;

	public CarFactory(GameTicket gameTicket) {
		racingCars = generateCars(gameTicket);
		count = gameTicket.getCount();
	}

	public List<Car> getCars() {
		return racingCars;
	}

	public int getCount() {
		return count;
	}

	private List<Car> generateCars(GameTicket gameTicket) {
		final List<Car> racingCars = new ArrayList<>();
		for (OrderSheet carOrder : gameTicket.getOrderSheets()) {
			racingCars.add(new Car(carOrder));
		}
		return racingCars;
	}
}
