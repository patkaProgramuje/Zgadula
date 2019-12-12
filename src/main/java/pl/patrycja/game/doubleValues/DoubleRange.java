package pl.patrycja.game.doubleValues;

import pl.patrycja.game.baseValues.BaseRange;

import java.util.concurrent.ThreadLocalRandom;

public class DoubleRange extends BaseRange {

    Double min;
    Double max;

    public DoubleRange(Double min, Double max) {
        this.min = Math.min(min, max);
        this.max = Math.max(min, max);
    }

    @Override
    public DoubleNumber drawRangeNumber() {
        if (min.equals(max)) {
            return new DoubleNumber(min);
        } else {
            double doubleNumber = ThreadLocalRandom.current().nextDouble(min, max);
            return new DoubleNumber(doubleNumber);
        }
    }

    @Override
    public String toString() {
        return toString(min.toString(), max.toString());
    }
}