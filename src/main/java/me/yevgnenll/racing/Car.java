package me.yevgnenll.racing;

public class Car {

	private final String name;

	public Car(OrderSheet orderSheet) {
		name = orderSheet.getName();
	}

	public String getName() {
		return name;
	}


}
