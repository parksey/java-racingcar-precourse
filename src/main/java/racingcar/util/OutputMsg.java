package racingcar.util;

public enum OutputMsg {
    INPUT_NAMES("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_COUNT("시도할 회수는 몇회인가요?"),
    PLAY_RESULT("실행 결과"),
    BY(" : "),
    RESULT("최종 우승자 : "),
    SEPERATE(", ");
    private final String msg;

    OutputMsg(String msg) {
        this.msg = msg;
    }


    public String getMsg() {
        return msg;
    }
}
