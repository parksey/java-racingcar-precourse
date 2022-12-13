package racingcar.domain;

import racingcar.util.OutputMsg;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Result {
    private List<String> totalResult;

    public Result(List<Car> cars) {
        this.totalResult = new ArrayList<>();
        setTotalResult(cars);
    }

    public static Result of(GameCars gameCars) {
        return new Result(gameCars.getCars());
    }
    public void setTotalResult(List<Car> cars) {
        long max = 0;
        for (Car car : cars) {
            updateResultNames(max, car);
        }
    }

    public void updateResultNames(long max, Car car) {
        if (max == car.getPosition()) {
            this.totalResult.add(car.getName());
            return;
        }
        if (max < car.getPosition()) {
            this.totalResult = new ArrayList<>();
            this.totalResult.add(car.getName());
            return;
        }
        return;
    }

    @Override
    public String toString() {
        return getNames();
    }

    public String getNames() {
        StringJoiner result = new StringJoiner(OutputMsg.SEPERATE.getMsg());
        for (String name : totalResult) {
            result.add(name);
        }
        return result.toString();
    }
}
