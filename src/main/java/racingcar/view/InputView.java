package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.util.CarStatus;

import java.util.List;

public class InputView {
    public String getUserInput() {
        return Console.readLine();
    }

    /**
     * 경주할 자동차 이름 리스트
     * @return
     */
    public List<String> readGameCars() {
        String userInput = getUserInput();
        return checkGameCars(userInput);
    }

    public List<String> checkGameCars(String userInput) {
        InputException.nullException(userInput);
        InputException.notStartEndWithComma(userInput);

        List<String> inputList = List.of(userInput.split(CarStatus.COMMA.getStatus()));
        InputException.checkEachCarNameException(inputList);
        return inputList;
    }

    /**
     * 시도할 회수 입력 받는 함수
     * @return
     */
    public long readGameTern() {
        String userInput = getUserInput();
        checkGameTern(userInput);
        return Long.parseLong(userInput);
    }

    public void checkGameTern(String userInput) {
        InputException.nullException(userInput);
        InputException.zeroException(userInput);
        InputException.notNumberException(userInput);
    }
}
