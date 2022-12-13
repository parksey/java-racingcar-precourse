package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;
public class CarTest {

    @Test
    public void test() {
        Car car = Car.of("HI");
        assertThat(car.toString()).isEqualTo("");
        car.move(true);
        car.move(true);
        assertThat(car.toString()).isEqualTo("--");
    }
}
