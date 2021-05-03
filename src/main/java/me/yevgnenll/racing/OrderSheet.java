package me.yevgnenll.racing;

import java.util.List;

public class OrderSheet {

	private final String name;

	public OrderSheet(List<String> carNames, int index) {
		name = carNames.get(index);
	}

	public String getName() {
		return name;
	}
}
