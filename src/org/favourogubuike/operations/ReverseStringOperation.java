package org.favourogubuike.operations;

import org.favourogubuike.types.*;

public class ReverseStringOperation implements Operation {

    @Override
    public DataElement<?> apply(DataElement<?> input) {
        if (!(input instanceof StringElement)) {
            throw new IllegalArgumentException("Reverse (string) only supports string input.");
        }

        String reversed = new StringBuilder(((StringElement) input).getValue()).reverse().toString();
        return new StringElement(reversed);
    }
}
