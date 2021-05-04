import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import me.yevgnenll.racing.Car;
import me.yevgnenll.racing.CarFactory;
import me.yevgnenll.racing.Cars;
import me.yevgnenll.racing.MockSpeedTrue;
import me.yevgnenll.racing.OutputConsole;
import me.yevgnenll.racing.UserInput;

public class RefereeTest {

	@Test
	@DisplayName(value = "가장 멀리간 자동차를 우승자로 선발한다")
	void findWinner() {
		Referee referee = new Referee(new UserInput(), new OutputConsole());

		CarFactory carFactory = new CarFactory("kaki,dodo,zelda", 6);
		Cars cars = carFactory.getCars();
		for (Car car : cars.getCarList()) {
			if ("kaki".equals(car.getName())) {
				car.race(new MockSpeedTrue());
			}
		}
		assertThat(referee.getWinners(carFactory.getCars()).getCarNames()).isEqualTo(Arrays.asList("kaki"));
	}

	@Test
	@DisplayName(value = "공동 우승인 경우 우승자는 여러명 나온다")
	void findWinners() {
		Referee referee = new Referee(new UserInput(), new OutputConsole());

		CarFactory carFactory = new CarFactory("kaki,dodo,zelda,cho,park", 6);
		Cars cars = carFactory.getCars();
		for (Car car : cars.getCarList()) {
			if ("kaki".equals(car.getName()) || "dodo".equals(car.getName())) {
				car.race(new MockSpeedTrue());
			}
		}
		assertThat(referee.getWinners(carFactory.getCars()).getCarNames()).isEqualTo(Arrays.asList("kaki", "dodo"));

	}

}
