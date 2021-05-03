package me.yevgnenll.racing;

import java.util.List;

public class RacingTrack {

	private final List<Car> cars;
	private final int count;

	public RacingTrack(CarFactory carFactory) {
		cars = carFactory.getCars();
		count = carFactory.getCount();
	}

	protected int getCount() {
		return count;
	}

}
