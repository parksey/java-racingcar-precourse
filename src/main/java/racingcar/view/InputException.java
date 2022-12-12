package racingcar.view;

import racingcar.util.CarCode;
import racingcar.util.CarStatus;
import racingcar.util.ExceptionMsg;

import java.util.List;

public class InputException {
    public static void nullException(String userInput) {
        if (userInput == null || userInput.isBlank() || userInput.isEmpty()) {
            throw new IllegalArgumentException(ExceptionMsg.NULL.getMsg());
        }
    }

    public static void notStartEndWithComma(String userInput) {
        if (userInput.startsWith(CarStatus.COMMA.getStatus())
        || userInput.endsWith(CarStatus.COMMA.getStatus())) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_FORMAT.getMsg());
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
            throw new IllegalArgumentException(ExceptionMsg.OVER_SIZE.getMsg());
        }
    }

    public static void notNumberException(String userInput) {
        for(int inputIndex = 0; inputIndex < userInput.length(); inputIndex++) {
            isDigitException(userInput.charAt(inputIndex));
        }
    }

    public static void isDigitException(char input) {
        if (!Character.isDigit(input)) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_NUMBER.getMsg());
        }
    }

    public static void zeroException(String userInput) {
        if (userInput.equals(CarStatus.ZERO.getStatus())) {
            throw new IllegalArgumentException(ExceptionMsg.ZERO.getMsg());
        }
    }
}
