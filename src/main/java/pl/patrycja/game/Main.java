package pl.patrycja.game;

import pl.patrycja.game.integerValues.IntegerRange;

public class Main {

    public static void main(String[] args) {
        Range range = new IntegerRange(1, 10);
        System.out.println("Hello in my magic game. Guess the number between " + range + ". Enjoy!");
        Game game = new Game(range);
        game.play();
    }
}