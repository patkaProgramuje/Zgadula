package pl.patrycja.game;

public abstract class BaseNumber extends Number implements Comparable<Number> {

    private Number value;

    public BaseNumber(Number value) {
        this.value = value;
    }

    abstract protected int compare(Number o1, Number o2);

    public int compareTo(Number number) {
        return compare(value, number);
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    @Override
    public long longValue() {
        return value.longValue();
    }

    @Override
    public float floatValue() {
        return value.floatValue();
    }

    @Override
    public double doubleValue() {
        return value.doubleValue();
    }
}