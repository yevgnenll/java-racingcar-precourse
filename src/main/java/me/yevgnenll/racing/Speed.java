package me.yevgnenll.racing;

import java.util.concurrent.ThreadLocalRandom;

public class Speed {

	public boolean isRun() {
		return ThreadLocalRandom.current().nextInt(10) >= 4;
	}

}
