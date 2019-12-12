package pl.patrycja.game.integerValues;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pl.patrycja.game.doubleValues.DoubleRange;

import static org.testng.Assert.*;

public class IntegerRangeTest {

    @DataProvider
    public static Object[][] forDrawRangeNumber() {
        return new Object[][] {
                {1, 100}, {-10, 10}, {-20, -10}, {1, 1}, {0, 0}
        };
    }

    @Test(dataProvider = "forDrawRangeNumber")
    public void getDrawRangeNumber(int floor, int ceiling) {
        for (int i = 0; i < 10000; i++) {
            IntegerRange range = new IntegerRange(floor, ceiling);
            int result = range.drawRangeNumber().intValue();
            assertTrue(floor <= result && result <= ceiling, "Number must be from range <" + floor + "," + ceiling + ">");
        }
    }

    @DataProvider
    public static Object[][] forToString() {
        return new Object[][] {
                {1, 100, "<1,100>"}, {-10, 10, "<-10,10>"}, {-20, -10, "<-20,-10>"}
        };
    }

    @Test(dataProvider = "forToString")
    public void testTestToString(int floor, int ceiling, String string) {
        assertEquals(new IntegerRange(floor, ceiling).toString(), string);
    }
}