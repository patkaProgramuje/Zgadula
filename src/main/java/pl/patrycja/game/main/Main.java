package pl.patrycja.game.main;

import pl.patrycja.game.baseValues.BaseNumber;
import pl.patrycja.game.baseValues.BaseRange;
import pl.patrycja.game.integerValues.IntegerRange;

import static pl.patrycja.game.main.ComparisonResult.Correct;

public class Main {

    public static void main(String[] args) {
        BaseRange range = new IntegerRange(30, 36);
        System.out.println("Hello in my magic game. Guess the number between " + range + ". Enjoy!");
        playTheGame(range.drawRangeNumber());
    }

    private static void playTheGame(BaseNumber correctNumber) {
        BaseNumber userGuess;
        ComparisonResult result;
        do {
            userGuess = NumberSource.getNumberFromUser();
            result = ComparisonResult.of(userGuess.compareTo(correctNumber));
            System.out.println(result.message());
        } while (result != Correct); //TODO: check if amount od tries was exited
    }
}