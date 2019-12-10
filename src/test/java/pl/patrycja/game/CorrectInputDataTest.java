package pl.patrycja.game;

import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class CorrectInputDataTest {

    @Test
    public void testCheckIfUserEnterCorrectIntegerNumber() {
        String input = "10";
        Number number = CorrectInputData.checkCorrectData(input);
        assertNotNull(number);
    }

    @Test
    public void testCheckIfUserEnterCorrectDoubleNumber() {
        String input = "10.0";
        Number number = CorrectInputData.checkCorrectData(input);
        assertNotNull(number);
    }

    @Test
    public void testShouldReturnFormatExceptionForInputDifferentNumber() {
        String input = "string";
        Number number = CorrectInputData.checkCorrectData(input);
        assertNull(number);
    }
}