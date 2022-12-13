package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameCarsTest {
    @Test
    public void makeGameCars() {
        List<String> inputList = List.of("pobi", "woni", "jun");
        GameCars gameCars = GameCars.of(inputList);

        for (Car car : gameCars.getCars()) {
            assertThat(inputList).contains(car.getName());
        }
    }
}
