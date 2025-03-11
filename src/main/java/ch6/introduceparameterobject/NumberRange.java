package ch6.introduceparameterobject;

public class NumberRange {
    protected int min;
    protected int max;

    public NumberRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public boolean contains(int arg) {
        return arg >= min && arg <= max;
    }
}
