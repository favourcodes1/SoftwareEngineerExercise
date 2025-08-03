package org.favourogubuike.types;

public class StringElement implements DataElement<String> {
    private final String value;

    public StringElement(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String toOutputString() {
        return value;
    }
}
