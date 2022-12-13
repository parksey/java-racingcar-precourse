package racingcar.domain;

import java.util.List;

public class RacingDomain {
    private GameCars gameCars;

    public void setGameCars(List<String> inputList) {
        gameCars = GameCars.of(inputList);
    }

    public void setGameCount(long count) {
        gameCars.setTotalCont(count);
    }

    public void move() {
        gameCars.move();
    }

    public boolean isFinish() {
        return gameCars.isFinish();
    }

    public List<Car> getCars() {
        return gameCars.getCars();
    }

    public Result getResult() {
        return Result.of(gameCars);
    }
}
