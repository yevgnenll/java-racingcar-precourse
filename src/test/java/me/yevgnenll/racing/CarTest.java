package me.yevgnenll.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	@DisplayName(value = "이름을 입력 받으면 해당 이름의 자동차가 생성된다")
	void generateCar() {
		Car kaki = new Car("kaki");
		Car dodo = new Car("dodo");

		assertThat(kaki.getName()).isEqualTo("kaki");
		assertThat(dodo.getName()).isEqualTo("dodo");
	}

}
