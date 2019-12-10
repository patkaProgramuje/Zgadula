package pl.patrycja.game.doubleValues;

import pl.patrycja.game.Range;
import java.util.concurrent.ThreadLocalRandom;

public class DoubleRange implements Range {

    private Double min;
    private Double max;

    public DoubleRange(Double min, Double max) {
        this.min = min;
        this.max = max;
    }

    //TODO: handle case when user enter equals number, or min is greater then max
    @Override
    public RandomDoubleNumber drawRangeNumber() {
        double doubleNumber = ThreadLocalRandom.current().nextDouble(min, max);
        return new RandomDoubleNumber(doubleNumber);
    }

    @Override
    public String toString() {
        return min + " - " + max;
    }
}