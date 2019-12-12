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
            result = ComparisonResult.of(userGuess.compareTo(correctNumber));
            System.out.println(result.message());
        } while (result != Correct); //TODO: check if amount od tries
    }

    //TODO: calculate amount of tries

}