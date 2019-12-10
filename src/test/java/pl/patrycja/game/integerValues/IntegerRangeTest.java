package pl.patrycja.game.integerValues;

import org.testng.annotations.Test;
import pl.patrycja.game.BaseNumber;
import pl.patrycja.game.Range;

import static org.testng.Assert.*;

public class IntegerRangeTest {

    @Test
    public void testDrawIntegerRandomNumber() {
        Range range = new IntegerRange(1, 10);
        BaseNumber randomNumber = range.drawRangeNumber();
        assertTrue(randomNumber.intValue() >= 1);
        assertTrue(randomNumber.intValue() <= 10);
    }
}