package racingcar.domain;

import racingcar.Car;

import java.util.ArrayList;
import java.util.List;

public class GameCars {
    List<Car> cars;

    public GameCars(List<Car> cars) {
        this.cars = cars;
    }

    public static GameCars of(List<String> carNames) {
        return new GameCars(getCarList(carNames));
    }

    public static List<Car> getCarList(List<String> carNames) {
        List<Car> carList = new ArrayList<>();
        for (String name : carNames) {
            carList.add(Car.of(name));
        }
        return carList;
    }

    public List<Car> getCars() {
        return cars;
    }
}
