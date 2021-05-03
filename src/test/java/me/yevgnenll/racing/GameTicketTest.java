package me.yevgnenll.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTicketTest {

	private GameTicket ticket;

	@BeforeEach
	private void init() {
		int count = 5;
		String carNames = "kaki,blue,cup,lemon";
		ticket = new GameTicket(carNames, count);
	}

	@Test
	@DisplayName(value = "콤마로 구분된 자동차 이름과 실행 횟수를 받아 ticket 을 만든다, 자동차 개수는 콤마 + 1 이다.")
	void generateTicket() {
		assertThat(ticket.getCarNames().size()).isEqualTo(4);
		assertThat(ticket.getCount()).isEqualTo(5);
		for (String name : ticket.getCarNames()) {
			assertThat(name.contains(" ")).isFalse();
		}
	}

	@Test
	@DisplayName(value = "자동차 이름이 하나인 경우 size 는 1이 된다.")
	void oneCar() {
		GameTicket oneCar = new GameTicket("nano", 10);

		assertThat(oneCar.getCarNames().size()).isEqualTo(1);
		assertThat(oneCar.getCarNames().get(0)).isEqualTo("nano");
	}

}
