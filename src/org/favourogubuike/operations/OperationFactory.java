package org.favourogubuike.operations;

import org.favourogubuike.types.*;

public class OperationFactory {

    /**
     * Dynamically selects and applies the correct operation.
     * @param op    Operation name
     * @param input Data element to transform
     * @return Transformed data element
     */
    public static DataElement<?> apply(String op, DataElement<?> input) {
        switch (op.toLowerCase()) {
            case "capitalize":
                return new CapitalizeOperation().apply(input);

            case "reverse":
                if (input instanceof StringElement)
                    return new ReverseStringOperation().apply(input);
                else if (input instanceof IntElement)
                    return new ReverseIntOperation().apply(input);
                else
                    throw new IllegalArgumentException("Reverse is only supported for strings and integers.");

            case "neg":
                return new NegateOperation().apply(input);

            default:
                throw new UnsupportedOperationException("Unsupported operation: " + op);
        }
    }
}
