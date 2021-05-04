package me.yevgnenll.racing;

public class RacingTrack {

	private final Cars cars;
	private int count;
	private final Speed speed;

	public RacingTrack(CarFactory carFactory) {
		cars = carFactory.getCars();
		count = carFactory.getCount();
		speed = new Speed();
	}

	public Cars racingCars() {
		driveCar();
		count--;
		return cars;
	}

	public boolean isFinish() {
		return count <= 0;
	}

	protected int getCount() {
		return count;
	}

	private void driveCar() {
		for (Car car : cars.getCarList()) {
			car.race(speed);
		}
	}
}
