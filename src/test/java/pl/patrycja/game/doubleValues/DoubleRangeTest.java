package pl.patrycja.game.doubleValues;

import org.testng.annotations.Test;
import pl.patrycja.game.BaseNumber;
import pl.patrycja.game.Range;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

public class DoubleRangeTest {

    @Test
    public void testDrawDoubleRandomNumberShouldReturnNumberFromRange() {
        Range range = new DoubleRange(1.0, 10.0);
        BaseNumber randomNumber = range.drawRangeNumber();
        assertTrue(randomNumber.doubleValue() >= 1.0);
        assertTrue(randomNumber.doubleValue() <= 10.0);
    }

    @Test
    public void testDrawDoubleRandomNumberShouldReturnIllegalArgumentExceptionWhenMinimumIsEqualsMaximum() {
        DoubleRange doubleRange = new DoubleRange(10.0, 10.0);
        assertThrows(IllegalArgumentException.class, doubleRange::drawRangeNumber);
    }

    @Test
    public void testDrawDoubleRandomNumberShouldReturnIllegalArgumentExceptionWhenMinimumIsGraterThanMaximum() {
        DoubleRange doubleRange = new DoubleRange(10.0, 2.0);
        assertThrows(IllegalArgumentException.class, doubleRange::drawRangeNumber);
    }
}