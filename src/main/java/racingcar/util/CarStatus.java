package racingcar.util;

public enum CarStatus {
    COMMA(",");

    private final String status;

    CarStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
