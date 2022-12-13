package racingcar.util;

public enum CarCode {
    ZERO(0),
    RANDOM_START(0),
    RANDOM_END(9),
    CAN_MOVE(4),
    NAME_SIZE(5);
    private final int code;

    CarCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
