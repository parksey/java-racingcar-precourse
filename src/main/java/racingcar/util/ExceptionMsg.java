package racingcar.util;

public enum ExceptionMsg {
    ERROR("[ERROR] "),
    NULL("아무 값도 입력하지 않았습니다."),
    NOT_FORMAT("잘못된 입력 형식입니다."),
    OVER_SIZE("차량 이름의 길이가 한도를 넘었습니다."),
    NOT_NUMBER("숫자가 아닙니다."),
    ZERO("0값은 게임을 시작할 수 없습니다.");

    private final String msg;

    ExceptionMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return ERROR.msg + msg;
    }
}
