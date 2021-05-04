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

	@Test
	@DisplayName(value = "난수를 발생시키는 객체를 전달 받으면 달린다")
	void runOnStay() {
		Car kaki = new Car("kaki");

		int go = 0;
		for (int i = 0; i < 5; i ++) {
			Speed speed = new Speed();
			go += speed.isRun() ? 1 : 0;
			kaki.race(speed);
		}
		assertThat(kaki.getPosition()).isEqualTo(go);
	}

	@Test
	@DisplayName(value = "speed 로 true를 반한봗은 횟수 만큼 -을 그린다")
	void load() {
		Car kaki = new Car("kaki");
		kaki.setPosition(3);
		assertThat(kaki.getLoad()).isEqualTo("---");
	}

}
