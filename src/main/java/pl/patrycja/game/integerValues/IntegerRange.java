package pl.patrycja.game.integerValues;

import pl.patrycja.game.baseValues.BaseRange;

import java.util.concurrent.ThreadLocalRandom;

public class IntegerRange extends BaseRange {

    Integer min;
    Integer max;

    public IntegerRange(Integer min, Integer max) {
        if (min < max) {
            this.min = min;
            this.max = max;
        } else {
            this.min = max;
            this.max = min;
        }
    }

    @Override
    public IntegerNumber drawRangeNumber() {
        if (min.equals(max)) {
            return new IntegerNumber(min);
        } else {
            int integerNumber = ThreadLocalRandom.current().nextInt(min, max);
            return new IntegerNumber(integerNumber);
        }
    }

    @Override
    public String toString() {
        return toString(min.toString(), max.toString());
    }
}