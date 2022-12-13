package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.CarCode;

public class Move {
    public static boolean canMove() {
        if (getRandomNumber() >= CarCode.CAN_MOVE.getCode()) {
            return true;
        }
        return false;
    }

    public static int getRandomNumber() {
        return Randoms.pickNumberInRange(CarCode.RANDOM_START.getCode(), CarCode.RANDOM_END.getCode());
    }
}
