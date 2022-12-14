package racingcar.util;

public enum CarStatus {
    ZERO("0"),
    COMMA(","),
    MOVE("-");

    private final String status;

    CarStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
