package me.yevgnenll.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingTrackTest {

	@Test
	@DisplayName(value = "실행 회수는 유저가 입력한 회수와 동일하다")
	void count() {
		CarFactory carFactory = new CarFactory("kaki,dodo", 5);
		RacingTrack game = new RacingTrack(carFactory);

		assertThat(game.getCount()).isEqualTo(5);
	}

}
