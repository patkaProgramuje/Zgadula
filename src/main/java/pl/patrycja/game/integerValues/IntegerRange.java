package pl.patrycja.game.integerValues;

import pl.patrycja.game.Range;

import java.util.concurrent.ThreadLocalRandom;

public class IntegerRange implements Range {

    Integer min;
    Integer max;

    public IntegerRange(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public RandomIntegerNumber drawRangeNumber() {
        int integerNumber = ThreadLocalRandom.current().nextInt(min, max);
        return new RandomIntegerNumber(integerNumber);
    }

    @Override
    public String toString() {
        return min + " - " + max;
    }
}