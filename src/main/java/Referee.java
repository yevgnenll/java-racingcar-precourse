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

	public Car getWinner(Cars cars) {
		int maxDistance = 0;
		Car winner = null;
		for (Car car : cars.getCarList()) {
			if (!isFurther(maxDistance, car)) {
				continue;
			}
			maxDistance = car.getPosition();
			winner = car;
		}
		return winner;
	}

	private void raceStart(RacingTrack racingTrack) {
		output.resultMessage();
		while (!racingTrack.isFinish()) {
			Cars drivingCars = racingTrack.racingCars();
			output.printDrivingCars(drivingCars);
		}
	}

	private boolean isFurther(int currentMaxDistance, Car car) {
		return currentMaxDistance < car.getPosition();
	}
}
