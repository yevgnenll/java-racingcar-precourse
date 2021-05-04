package me.yevgnenll.racing;

import java.util.concurrent.ThreadLocalRandom;

public class Speed {

	private static final int MAXIMUM_RANDOM_VALUE = 10;

	public boolean isRun() {
		return ThreadLocalRandom.current().nextInt(MAXIMUM_RANDOM_VALUE) >= 4;
	}

}
