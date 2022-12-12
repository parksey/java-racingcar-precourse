package racingcar.view;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputExceptionTest {
    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void null_test(String userInput) {
        assertThatThrownBy(()->{
            InputException.nullException(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void overNameSize_test(String userInput) {
        assertThatThrownBy(()->{
            InputException.overNameSizeException(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }


    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void notStartEndWithComma_test(String userInput) {
        assertThatThrownBy(()->{
            InputException.notStartEndWithComma(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
