package racingcar.view;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputTest {
    static InputView inputView;

    @BeforeAll
    static void setInputView() {
        inputView = new InputView();
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "pobiwoni,jun"
            , "pobi,hellowold"
            , "pobie,name,"
            , ",pobie,name"})
    public void checkGameCars_test(String userInput) {
        assertThatThrownBy(()-> {
            inputView.checkGameCars(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", " 4", "1 ", "1fe", "0"})
    public void checkGameTern_test(String userInput) {
        assertThatThrownBy(()-> {
            inputView.checkGameTern(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
