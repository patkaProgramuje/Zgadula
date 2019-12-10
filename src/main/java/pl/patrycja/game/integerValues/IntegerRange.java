package pl.patrycja.game.integerValues;

import pl.patrycja.game.Range;

import java.util.concurrent.ThreadLocalRandom;

public class IntegerRange implements Range {

    private Integer min;
    private Integer max;

    public IntegerRange(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    //TODO: handle case when user enter equals number, or min is greater then max
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