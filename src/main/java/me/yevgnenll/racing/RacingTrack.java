package me.yevgnenll.racing;

import java.util.List;

public class RacingTrack {

	private final List<Car> cars;
	private int count;
	private final Speed speed;

	public RacingTrack(CarFactory carFactory) {
		cars = carFactory.getCars();
		count = carFactory.getCount();
		speed = new Speed();
	}

	public void racingCars() {
		while (!isFinish()) {
			driveCar();
			count--;
		}
	}

	public boolean isFinish() {
		return count <= 0;
	}

	protected int getCount() {
		return count;
	}

	private void driveCar() {
		for (Car car : cars) {
			car.race(speed);
		}
	}
}
