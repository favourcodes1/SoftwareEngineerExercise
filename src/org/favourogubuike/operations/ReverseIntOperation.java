package org.favourogubuike.operations;

import org.favourogubuike.types.*;

public class ReverseIntOperation implements Operation {

    @Override
    public DataElement<?> apply(DataElement<?> input) {
        if (!(input instanceof IntElement)) {
            throw new IllegalArgumentException("Reverse (int) only supports int input.");
        }

        int value = ((IntElement) input).getValue();
        String reversedStr = new StringBuilder(Integer.toString(Math.abs(value))).reverse().toString();
        int reversed = Integer.parseInt(reversedStr);
        return new IntElement(value < 0 ? -reversed : reversed);
    }
}
