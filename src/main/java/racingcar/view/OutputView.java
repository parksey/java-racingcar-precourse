package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Result;
import racingcar.util.OutputMsg;

import java.util.List;

public class OutputView {

    public void printEmptyMsg() {
        System.out.println();
    }
    public void printMsg(String msg) {
        System.out.println(msg);
    }

    /**
     * 실행 결과 출력 메서드
     */
    public void printEachResult(List<Car> cars) {
        for (Car car : cars) {
            printMsg(getMoveMsg(car));
        }
    }
    public String getMoveMsg(Car car) {
        return car.getName()+ OutputMsg.BY.getMsg()+car.toString();
    }

    public void printResult(Result result) {
        printMsg(getResultMsg(result));
    }
    public String getResultMsg(Result result) {
        return OutputMsg.RESULT.getMsg()+result.toString();
    }
}
