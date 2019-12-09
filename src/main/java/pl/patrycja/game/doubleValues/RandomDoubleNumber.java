package pl.patrycja.game.doubleValues;

public class RandomDoubleNumber extends DoubleNumber {

    public RandomDoubleNumber(double number) {
        super(number);
    }

    @Override
    public String toString() {
        return String.valueOf(super.doubleValue());
    }
}