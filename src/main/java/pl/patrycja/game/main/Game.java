package pl.patrycja.game.main;

import jdk.swing.interop.SwingInterOpUtils;
import pl.patrycja.game.baseValues.BaseNumber;
import pl.patrycja.game.baseValues.BaseRange;

import static pl.patrycja.game.main.ComparisonResult.*;

public class Game {

    private BaseRange range;

    public Game(BaseRange range) {
        this.range = range;
    }

    public void play() {
        BaseNumber correctNumber = range.drawRangeNumber();
        BaseNumber userNumber;
        ComparisonResult result;
        do {
            userNumber = NumberSource.getNumberFromUser();
            result = compare(correctNumber, userNumber);
            System.out.println(result);
        } while (result != Correct); //TODO: check if amount od tries
    }

    //TODO: calculate amount of tries

    private ComparisonResult compare(BaseNumber randomDoubleNumber, BaseNumber userDoubleNumber) {

        switch (randomDoubleNumber.compareTo(userDoubleNumber)) {
            case -1:
                return TooHigh;
            case 0:
                return Correct;
            default:
                return TooLow;
        }
    }
}