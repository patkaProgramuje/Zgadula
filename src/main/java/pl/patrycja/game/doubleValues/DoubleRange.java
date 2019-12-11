package pl.patrycja.game.doubleValues;

import pl.patrycja.game.baseValues.BaseRange;

import java.util.concurrent.ThreadLocalRandom;

public class DoubleRange extends BaseRange {

    Double min;
    Double max;

    public DoubleRange(Double min, Double max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public DoubleNumber drawRangeNumber() {
        double doubleNumber = ThreadLocalRandom.current().nextDouble(min, max);
        return new DoubleNumber(doubleNumber);
    }

    @Override
    public String toString() {
        return toString(min.toString(), max.toString());
    }
}