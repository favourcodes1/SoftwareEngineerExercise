package org.favourogubuike.operations;

import org.favourogubuike.types.*;

public class NegateOperation implements Operation {

    @Override
    public DataElement<?> apply(DataElement<?> input) {
        if (input instanceof IntElement) {
            int val = ((IntElement) input).getValue();
            return new IntElement(-val);
        } else if (input instanceof DoubleElement) {
            double val = ((DoubleElement) input).getValue();
            return new DoubleElement(-val);
        } else {
            throw new IllegalArgumentException("Negate only supports int and double types.");
        }
    }
}
