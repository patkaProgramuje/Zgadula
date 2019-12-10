package pl.patrycja.game;

import org.testng.annotations.Test;
import pl.patrycja.game.doubleValues.DoubleNumber;
import pl.patrycja.game.integerValues.IntegerNumber;

import static org.testng.Assert.*;

public class BaseNumberTest {

    @Test
    public void testCompareIfTwoDoubleNumbersAreEqual() {
        BaseNumber doubleNumberOne = new DoubleNumber(3.0);
        BaseNumber doubleNumberSecond = new DoubleNumber(3.0);
        int comparisonResult = doubleNumberOne.compareTo(doubleNumberSecond);
        assertEquals(0, comparisonResult);
    }

    @Test
    public void testCompareIfFirstDoubleNumberIsLowerThanSecond() {
        BaseNumber doubleNumberOne = new DoubleNumber(3.0);
        BaseNumber doubleNumberSecond = new DoubleNumber(3.1);
        int comparisonResult = doubleNumberOne.compareTo(doubleNumberSecond);
        assertEquals(-1, comparisonResult);
    }
    @Test
    public void testCompareIfFirstDoubleNumberIsGraterThanSecond() {
        BaseNumber doubleNumberOne = new DoubleNumber(3.3);
        BaseNumber doubleNumberSecond = new DoubleNumber(3.1);
        int comparisonResult = doubleNumberOne.compareTo(doubleNumberSecond);
        assertEquals(1, comparisonResult);
    }

    @Test
    public void testCompareIfTwoIntegerNumbersAreEqual() {
        BaseNumber doubleNumberOne = new IntegerNumber(1);
        BaseNumber doubleNumberSecond = new IntegerNumber(1);
        int comparisonResult = doubleNumberOne.compareTo(doubleNumberSecond);
        assertEquals(0, comparisonResult);
    }

    @Test
    public void testCompareIfFirstIntegerNumberIsLowerThanSecond() {
        BaseNumber doubleNumberOne = new IntegerNumber(1);
        BaseNumber doubleNumberSecond = new IntegerNumber(5);
        int comparisonResult = doubleNumberOne.compareTo(doubleNumberSecond);
        assertEquals(-1, comparisonResult);
    }

    @Test
    public void testCompareIfFirstIntegerNumberIsGraterThanSecond() {
        BaseNumber doubleNumberOne = new IntegerNumber(5);
        BaseNumber doubleNumberSecond = new IntegerNumber(1);
        int comparisonResult = doubleNumberOne.compareTo(doubleNumberSecond);
        assertEquals(1, comparisonResult);
    }

    @Test
    public void testCompareIfNumbersHaveDifferentClass() {
        BaseNumber doubleNumberOne = new IntegerNumber(5);
        BaseNumber doubleNumberSecond = new DoubleNumber(1.0);
        int comparisonResult = doubleNumberOne.compareTo(doubleNumberSecond);
        assertEquals(1, comparisonResult);
    }
}