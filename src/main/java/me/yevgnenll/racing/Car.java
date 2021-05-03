package me.yevgnenll.racing;

public class Car {

	private final String name;

	public Car(GameTicket gameTicket, int index) {
		name = gameTicket.getCarNames().get(index);
	}

	public String getName() {
		return name;
	}


}
