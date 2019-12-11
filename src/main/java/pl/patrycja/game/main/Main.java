package pl.patrycja.game.main;

import pl.patrycja.game.baseValues.BaseRange;
import pl.patrycja.game.integerValues.IntegerRange;
import pl.patrycja.game.main.Game;

public class Main {

    public static void main(String[] args) {
        BaseRange range = new IntegerRange(30, 36);
        System.out.println("Hello in my magic game. Guess the number between " + range + ". Enjoy!");
        Game game = new Game(range);
        game.play();
    }
}