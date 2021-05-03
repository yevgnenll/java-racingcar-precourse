package me.yevgnenll.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarFactoryTest {

	private CarFactory factory;

	@BeforeEach
	void init() {
		factory = new CarFactory(new GameTicket("kaki,gom", 5));
	}

	@Test
	@DisplayName(value = "ticket 을 통해 경주에 참여할 자동자들을 만든다")
	void carFactory() {
		assertThat(factory.getCars().size()).isEqualTo(2);
	}

	@Test
	@DisplayName(value = "GameTicket에 명시된 count 를 factory 를 소유한다.")
	void count() {
		assertThat(factory.getCount()).isEqualTo(5);
	}

}
