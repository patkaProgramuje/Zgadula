package pl.patrycja.game.doubleValues;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DoubleNumberTest {

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
        DoubleNumber number = new DoubleNumber(1);
        assertEquals(number.compare(o1, o2), result);
    }

    @Test(dataProvider = "forTestCompare")
    public void testCompareTo(Number o1, Number o2, int result) {
        DoubleNumber number = new DoubleNumber(o1.doubleValue());
        assertEquals(number.compareTo(o2), result);
    }

    @DataProvider
    public static Object[][] forTestToString() {
        return new Object[][] {
                {5.0, "5.0"}, {5.01, "5.01"}, {5.12222, "5.12222"}
        };
    }

    @Test(dataProvider = "forTestToString")
    public void testTestToString(double number, String string) {
        assertEquals(string, new DoubleNumber(number).toString());
    }
}