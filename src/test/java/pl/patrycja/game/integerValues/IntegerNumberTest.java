package pl.patrycja.game.integerValues;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pl.patrycja.game.doubleValues.DoubleNumber;

import static org.testng.Assert.*;

public class IntegerNumberTest {

    @DataProvider
    public static Object[][] forTestCompare() {
        return new Object[][] {
                {5, 10, -1}, {-5, 10, -1}, {-10, -3, -1},
                {0, 0, 0}, {5, 5, 0}, {-5, -5, 0},
                {10, 5, 1}, {10, -5, 1}, {-5, -10, 1}
        };
    }

    @Test(dataProvider = "forTestCompare")
    public void testCompare(Number o1, Number o2, int result) {
        IntegerNumber number = new IntegerNumber(1);
        assertEquals(number.compare(o1, o2), result);
    }

    @Test(dataProvider = "forTestCompare")
    public void testCompareTo(Number o1, Number o2, int result) {
        IntegerNumber number = new IntegerNumber(o1.intValue());
        assertEquals(number.compareTo(o2), result);
    }

    @DataProvider
    public static Object[][] forTestToString() {
        return new Object[][] {
                {5, "5"}, {-5, "-5"}
        };
    }

    @Test(dataProvider = "forTestToString")
    public void testTestToString(int number, String string) {
        assertEquals(string, new IntegerNumber(number).toString());
    }
}