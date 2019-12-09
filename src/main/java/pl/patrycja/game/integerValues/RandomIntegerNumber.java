package pl.patrycja.game.integerValues;

public class RandomIntegerNumber extends IntegerNumber {

    public RandomIntegerNumber(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return String.valueOf(super.intValue());
    }
}
