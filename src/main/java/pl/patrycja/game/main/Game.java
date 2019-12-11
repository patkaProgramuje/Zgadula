package pl.patrycja.game.main;

import pl.patrycja.game.baseValues.BaseNumber;
import pl.patrycja.game.baseValues.BaseRange;

import static pl.patrycja.game.main.ComparisonResult.*;

class Game {

    private BaseRange range;

    Game(BaseRange range) {
        this.range = range;
    }

    void play() {
        BaseNumber correctNumber = range.drawRangeNumber();
        BaseNumber userGuess;
        ComparisonResult result;
        do {
            userGuess = NumberSource.getNumberFromUser();
            result = compareNumbers(correctNumber, userGuess);
            System.out.println(result);
        } while (result != Correct); //TODO: check if amount od tries
    }

    //TODO: calculate amount of tries

    private ComparisonResult compareNumbers(BaseNumber userNumber, BaseNumber userGuess) {

        switch (userNumber.compareTo(userGuess)) {
            case -1:
                return TooHigh;
            case 0:
                return Correct;
            default:
                return TooLow;
        }
    }
}