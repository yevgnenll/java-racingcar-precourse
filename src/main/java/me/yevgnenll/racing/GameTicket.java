package me.yevgnenll.racing;

import java.util.ArrayList;
import java.util.List;

public class GameTicket {

	private final List<String> carNames;
	private final int count;

	public GameTicket(String carNames, int count) {
		this.carNames = getStrings(carNames);
		this.count = count;
	}

	public List<String> getCarNames() {
		return carNames;
	}

	public int getCount() {
		return count;
	}

	private List<String> getStrings(String carNames) {
		final List<String> result = new ArrayList<>();
		for (String name : carNames.split(",")) {
			result.add(name.trim());
		}
		return result;
	}

}
