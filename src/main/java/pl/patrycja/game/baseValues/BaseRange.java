package pl.patrycja.game.baseValues;

public abstract class BaseRange {
    public abstract BaseNumber drawRangeNumber();

    protected String toString(String min, String max) {
        return "<" + min + "," + max + ">";
    }
}