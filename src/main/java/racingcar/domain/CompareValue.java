package racingcar.domain;

public enum CompareValue {
    SAME(0),
    OVER(1),
    UNDER(-1);

    private final int value;

    CompareValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
