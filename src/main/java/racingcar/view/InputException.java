package racingcar.view;

import racingcar.util.CarCode;
import racingcar.util.CarStatus;

import java.util.List;

public class InputException {
    public static void nullException(String userInput) {
        if (userInput == null || userInput.isBlank() || userInput.isEmpty()) {
            throw new IllegalArgumentException("아무 값도 입력하지 않았습니다.");
        }
    }

    public static void notStartEndWithComma(String userInput) {
        if (userInput.startsWith(CarStatus.COMMA.getStatus())
        || userInput.endsWith(CarStatus.COMMA.getStatus())) {
            throw new IllegalArgumentException("잘못된 입력 형식입니다.");
        }
    }
    public static void checkEachCarNameException(List<String> inputList) {
        for (String carName: inputList) {
            nullException(carName);
            overNameSizeException(carName);
        }
    }

    public static void overNameSizeException(String userInput) {
        if (userInput.length() > CarCode.NAME_SIZE.getCode()) {
            throw new IllegalArgumentException("차량 이름의 길이가 한도를 넘었습니다.");
        }
    }

    public static void notNumberException(String userInput) {
        for(int inputIndex = 0; inputIndex < userInput.length(); inputIndex++) {
            isDigitException(userInput.charAt(inputIndex));
        }
    }

    public static void isDigitException(char input) {
        if (!Character.isDigit(input)) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
    }

    public static void zeroException(String userInput) {
        if (userInput.equals(CarStatus.ZERO.getStatus())) {
            throw new IllegalArgumentException("0값은 게임을 시작할 수 없습니다.");
        }
    }
}
