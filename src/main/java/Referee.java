import java.util.ArrayList;
import java.util.List;

import me.yevgnenll.racing.Car;
import me.yevgnenll.racing.CarFactory;
import me.yevgnenll.racing.Cars;
import me.yevgnenll.racing.OutputConsole;
import me.yevgnenll.racing.RacingTrack;
import me.yevgnenll.racing.UserInput;

public class Referee {

	private final UserInput input;
	private final OutputConsole output;

	public Referee(UserInput input, OutputConsole outputConsole) {
		this.input = input;
		this.output = outputConsole;
	}

	public static void main(String[] args) {
		Referee referee = new Referee(new UserInput(), new OutputConsole());
		referee.gameStart();
	}

	public void gameStart() {
		CarFactory carFactory = input.interactUser();
		RacingTrack racingTrack = new RacingTrack(carFactory);
		raceStart(racingTrack);
	}

	public Cars getWinners(Cars cars) {
		int maxDistance = getMaxPosition(cars);
		List<Car> winners = getFarthestCars(maxDistance, cars);
		return new Cars(winners);
	}

	private int getMaxPosition(Cars cars) {
		int maxDistance = 0;
		for (Car car : cars.getCarList()) {
			maxDistance = Math.max(car.getPosition(), maxDistance);
		}
		return maxDistance;
	}

	private List<Car> getFarthestCars(int maxDistance, Cars cars) {
		List<Car> result = new ArrayList<>();
		for (Car car : cars.getCarList()) {
			filterDistanceCar(car, maxDistance, result);
		}
		return result;
	}

	private void filterDistanceCar(Car car, int maxDistance, List<Car> winners) {
		if (isSameDistance(car, maxDistance)) {
			winners.add(car);
		}
	}

	private boolean isSameDistance(Car car, int maxDistance) {
		return maxDistance == car.getPosition();
	}

	private void raceStart(RacingTrack racingTrack) {
		output.resultMessage();
		while (!racingTrack.isFinish()) {
			Cars drivingCars = racingTrack.racingCars();
			output.printDrivingCars(drivingCars);
		}
		Cars winners = getWinners(racingTrack.getParticipantCars());
		output.printWinner(winners);
	}

}
