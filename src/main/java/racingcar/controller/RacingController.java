package racingcar.controller;

import racingcar.domain.RacingDomain;
import racingcar.util.OutputMsg;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingDomain racingDomain;

    public RacingController(InputView inputView, OutputView outputView, RacingDomain racingDomain) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingDomain = racingDomain;
    }

    public void start() {
        readRacingNameList();
        readGameCount();
        move();
        printResult();
    }

    public void readRacingNameList() {
        racingDomain.setGameCars(getRacingNameList());
    }

    public List<String> getRacingNameList() {
        while (true) {
            try {
                outputView.printMsg(OutputMsg.INPUT_NAMES.getMsg());
                return inputView.readGameCars();
            } catch (IllegalArgumentException exception) {
                outputView.printMsg(exception.getMessage());
                outputView.printEmptyMsg();
            }
        }
    }

    public void readGameCount() {
        racingDomain.setGameCount(getCount());
    }

    public long getCount() {
        while (true) {
            try {
                outputView.printMsg(OutputMsg.INPUT_COUNT.getMsg());
                return inputView.readGameTern();
            } catch (IllegalArgumentException exception) {
                outputView.printMsg(exception.getMessage());
                outputView.printEmptyMsg();
            }
        }
    }

    public void move() {
        outputView.printMsg(OutputMsg.PLAY_RESULT.getMsg());
        while (racingDomain.isFinish()) {
            racingDomain.move();
            outputView.printEachResult(racingDomain.getCars());
            outputView.printEmptyMsg();
        }
    }

    public void printResult() {
        outputView.printResult(racingDomain.getResult());
    }
}
