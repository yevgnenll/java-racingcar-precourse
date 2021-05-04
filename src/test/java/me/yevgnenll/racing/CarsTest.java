package me.yevgnenll.racing;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	@DisplayName(value = "자동차들을 1급 컬렉션인 Cars에 담으면 동일한 Car 가 저장된다")
	void cars() {
		CarFactory carFactory = new CarFactory("kaki,dodo,gom", 7);

		assertThat(carFactory.getCars().getCarList().size()).isEqualTo(3);
	}
}
