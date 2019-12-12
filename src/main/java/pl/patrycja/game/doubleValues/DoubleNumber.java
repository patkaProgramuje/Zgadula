package pl.patrycja.game.doubleValues;

import pl.patrycja.game.baseValues.BaseNumber;

public class DoubleNumber extends BaseNumber {

    public DoubleNumber(double value) {
        super(value);
    }

    @Override
    protected int compare(Number o1, Number o2) {
        return Double.compare(o1.doubleValue(), o2.doubleValue());
    }

    @Override
    public String toString() {
        return String.valueOf(super.doubleValue());
    }
}
