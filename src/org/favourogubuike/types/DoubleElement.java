package org.favourogubuike.types;

/**
 * A wrapper class representing a double value as a DataElement.
 */
public class DoubleElement implements DataElement<Double> {
    private final double value;

    public DoubleElement(double value) {
        this.value = value;
    }

    @Override
    public Double getValue() {
        return value;
    }

    @Override
    public String toOutputString() {
        return Double.toString(value);
    }
}
