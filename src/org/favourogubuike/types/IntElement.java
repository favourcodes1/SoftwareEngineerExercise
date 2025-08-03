package org.favourogubuike.types;

public class IntElement implements DataElement<Integer> {
    private final int value;

    public IntElement(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public String toOutputString() {
        return Integer.toString(value);
    }
}
