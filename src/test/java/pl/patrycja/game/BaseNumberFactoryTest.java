package pl.patrycja.game;

import org.testng.annotations.Test;

import java.util.Optional;

import static org.testng.Assert.assertFalse;

public class BaseNumberFactoryTest {

    @Test
    public void testBaseNumberFactoryShouldNotReturnNull() {
        String input = "100";
        BaseNumberFactory baseNumberFactory = new BaseNumberFactory();
        Optional<BaseNumber> baseNumber = baseNumberFactory.create(input);
        assertFalse(baseNumber.isEmpty());
    }
}