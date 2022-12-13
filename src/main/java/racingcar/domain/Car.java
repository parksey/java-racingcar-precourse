package racingcar.domain;

import racingcar.util.CarStatus;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    // 추가 기능 구현
    public static Car of(String name) {
        return new Car(name);
    }

    public String getName() {
        return name;
    }

    public void move(boolean canMove) {
        if (canMove) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return CarStatus.MOVE.getStatus().repeat(position);
    }
}
