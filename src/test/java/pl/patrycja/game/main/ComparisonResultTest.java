package pl.patrycja.game.main;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static pl.patrycja.game.main.ComparisonResult.*;
import static pl.patrycja.game.main.ComparisonResult.TooHigh;

public class ComparisonResultTest {

    @DataProvider
    public static Object[][] forTestOfSimple() {
        return new Object[][] {
                {-1, TooLow}, {1, TooHigh}, {0, Correct}, {-2, TooLow}, {2, TooHigh}
        };
    }

    @Test(dataProvider = "forTestOfSimple")
    public void testOfSimple(int compareResult, ComparisonResult result) {
        assertEquals(result, ComparisonResult.of(compareResult));
    }

    @DataProvider
    public static Object[][] forTestOfUsingCompare() {
        return new Object[][] {
                {5, 10, TooLow}, {-5, 10, TooLow}, {-10, -3, TooLow},
                {0, 0, Correct}, {5, 5, Correct}, {-5, -5, Correct},
                {10, 5, TooHigh}, {10, -5, TooHigh}, {-5, -10, TooHigh}
        };
    }

    @Test(dataProvider = "forTestOfUsingCompare")
    public void testOfUsingCompare(Integer first, Integer second, ComparisonResult result) {
        int compareResult = first.compareTo(second);
        assertEquals(result, ComparisonResult.of(compareResult));
    }

    @DataProvider
    public static Object[][] forTestMessage() {
        return new Object[][] {
                {"Number is too low", TooLow},
                {"Number is too high", TooHigh},
                {"Correct! That’s the number", Correct}
        };
    }

    @Test(dataProvider = "forTestMessage")
    public void testMessage(String message, ComparisonResult result) {
        assertEquals(message, result.message());
    }

}