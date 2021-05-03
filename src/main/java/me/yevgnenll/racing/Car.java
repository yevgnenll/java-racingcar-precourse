package me.yevgnenll.racing;

public class Car {

	private final String name;
	private int position;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void race(Speed speed) {
		if (speed.isRun()) {
			position++;
		}
	}

	protected int getPosition() {
		return position;
	}

}
