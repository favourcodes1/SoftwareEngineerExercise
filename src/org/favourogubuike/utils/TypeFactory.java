package org.favourogubuike.utils;

import org.favourogubuike.types.*;

public class TypeFactory {

    /**
     * Creates a typed DataElement from a string input and type name.
     * @param type  The type name (e.g., "string", "int", "double")
     * @param value The string value from input
     * @return A corresponding typed DataElement
     */
    public static DataElement<?> create(String type, String value) {
        switch (type) {
            case "string":
                return new StringElement(value);
            case "int":
                return new IntElement(Integer.parseInt(value));
            case "double":
                return new DoubleElement(Double.parseDouble(value));
            default:
                throw new IllegalArgumentException("Unsupported input type: " + type);
        }
    }
}
