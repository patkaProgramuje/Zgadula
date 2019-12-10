package pl.patrycja.game;

import org.testng.annotations.Test;
import pl.patrycja.game.doubleValues.DoubleRange;
import pl.patrycja.game.doubleValues.RandomDoubleNumber;
import pl.patrycja.game.doubleValues.UserDoubleNumber;
import pl.patrycja.game.integerValues.UserIntegerNumber;

import static org.testng.Assert.*;

public class GameTest {

    @Test
    public void checkIdentifyIfNumbersAreEqual(){
        BaseNumber userNumber = new UserDoubleNumber(30.0);
        BaseNumber randomNumber = new RandomDoubleNumber(30.0);

        Range range = new DoubleRange(1.0, 40.0);
        Game game = new Game(range);

        boolean identify = game.identify(randomNumber, userNumber);
        assertTrue(identify);
    }

    @Test
    public void checkIdentifyIfNumbersAreDifferent(){
        BaseNumber userNumber = new UserDoubleNumber(30.0);
        BaseNumber randomNumber = new RandomDoubleNumber(35.0);

        Range range = new DoubleRange(1.0, 40.0);
        Game game = new Game(range);

        boolean identify = game.identify(randomNumber, userNumber);
        assertFalse(identify);
    }

    @Test
    public void checkIdentifyIfNumbersHaveDifferentClass(){
        BaseNumber userNumber = new UserIntegerNumber(30);
        BaseNumber randomNumber = new RandomDoubleNumber(35.0);

        Range range = new DoubleRange(1.0, 40.0);
        Game game = new Game(range);

        boolean identify = game.identify(randomNumber, userNumber);
        assertFalse(identify);
    }
}