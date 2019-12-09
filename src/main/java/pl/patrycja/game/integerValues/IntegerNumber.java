package pl.patrycja.game.integerValues;


import pl.patrycja.game.BaseNumber;

public class IntegerNumber extends BaseNumber {

    public IntegerNumber(int value) {
        super(value);
    }

    @Override
    protected int compare(Number o1, Number o2) {
        return Integer.compare(o1.intValue(), o2.intValue());
    }
}
