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

	public int getPosition() {
		return position;
	}

	protected void setPosition(int position) {
		this.position = position;
	}

	public String getLoad() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < position; i++) {
			result.append("-");
		}
		return result.toString();
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(name);
		result.append(": ")
			.append(getLoad());
		return result.toString();
	}
}
