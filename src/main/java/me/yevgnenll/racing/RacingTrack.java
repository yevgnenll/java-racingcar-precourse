package me.yevgnenll.racing;

public class RacingTrack {

	private final Cars cars;
	private int count;
	private final Speed speed;
	private final OutputConsole output;

	public RacingTrack(CarFactory carFactory, OutputConsole outputConsole) {
		cars = carFactory.getCars();
		count = carFactory.getCount();
		speed = new Speed();
		output = outputConsole;
	}

	public Cars racingCars() {
		while (!isFinish()) {
			driveCar();
			count--;
			System.out.println(output.calculateString(cars));
		}
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
