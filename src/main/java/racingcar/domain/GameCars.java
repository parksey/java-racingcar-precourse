package racingcar.domain;

import racingcar.util.CarCode;

import java.util.ArrayList;
import java.util.List;

public class GameCars {
    private List<Car> cars;
    private long totalCount;

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

    public void setTotalCont(long totalCount) {
        this.totalCount = totalCount;
    }

    public void move() {
        for (Car car : cars) {
            eachMove(car);
        }
    }

    public void eachMove(Car car) {
        car.move(Move.canMove());
    }

    public boolean isFinish() {
        totalCount--;
        if (totalCount == CarCode.ZERO.getCode()) {
            return true;
        }
        return false;
    }

}
