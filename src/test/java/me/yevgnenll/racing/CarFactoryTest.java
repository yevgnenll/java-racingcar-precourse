package me.yevgnenll.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarFactoryTest {

	private CarFactory factory;

	@BeforeEach
	void init() {
		factory = new CarFactory("kaki,gom", 5);
	}

	@Test
	@DisplayName(value = "사용자가 입력하여 콤마(,)로 구분한 이름의 개수만큼 자동차가 생성된다")
	void carFactory() {
		assertThat(factory.getCars().size()).isEqualTo(2);
	}

	@Test
	@DisplayName(value = "사용자가 입력한 count 가 factory 에 저장된다.")
	void count() {
		assertThat(factory.getCount()).isEqualTo(5);
	}

}
