package racingcar.util;

public enum CarCode {
    NAME_SIZE(5);
    private final int code;

    CarCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
