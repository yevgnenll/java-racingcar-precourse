package me.yevgnenll.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingTrackTest {

	private CarFactory carFactory;
	private RacingTrack racingTrack;

	@BeforeEach
	void init() {
		carFactory = new CarFactory("kaki,dodo", 5);
		racingTrack = new RacingTrack(carFactory);
	}

	@Test
	@DisplayName(value = "실행 회수는 유저가 입력한 회수와 동일하다")
	void count() {
		assertThat(racingTrack.getCount()).isEqualTo(5);
	}

	@Test
	@DisplayName(value = "실행 회수를 모두 소진하면 게임은 종료된다")
	void consumeCount() {
		racingTrack.racingCars();
		assertThat(racingTrack.isFinish()).isTrue();
	}

}
