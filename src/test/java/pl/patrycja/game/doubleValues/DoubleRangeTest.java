package pl.patrycja.game.doubleValues;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DoubleRangeTest {

    @DataProvider
    public static Object[][] forDrawRangeNumber() {
        return new Object[][] {
                {1, 100}, {-10, 10}, {-20, -10}, {1, 1}, {0, 0}
        };
    }

    @Test(dataProvider = "forDrawRangeNumber")
    public void getDrawRangeNumber(double floor, double ceiling) {
        for (int i = 0; i < 10000; i++) {
            DoubleRange range = new DoubleRange(floor, ceiling);
            double result = range.drawRangeNumber().doubleValue();
            assertTrue(floor <= result && result <= ceiling, "Number must be from range <" + floor + "," + ceiling + ">");
        }
    }

    @DataProvider
    public static Object[][] forToString() {
        return new Object[][] {
                {1, 100, "<1.0,100.0>"}, {-10.02, 10.05, "<-10.02,10.05>"},
                {-20, -10, "<-20.0,-10.0>"}, {1.123, 1, "<1.0,1.123>"}
        };
    }

    @Test(dataProvider = "forToString")
    public void testTestToString(double floor, double ceiling, String string) {
        assertEquals(new DoubleRange(floor, ceiling).toString(), string);
    }
}