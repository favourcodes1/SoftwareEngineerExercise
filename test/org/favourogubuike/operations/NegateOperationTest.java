package org.favourogubuike.operations;

import org.favourogubuike.operations.NegateOperation;
import org.favourogubuike.types.IntElement;
import org.favourogubuike.types.DoubleElement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NegateOperationTest {

    @Test
    void testNegateInt() {
        NegateOperation op = new NegateOperation();
        IntElement input = new IntElement(42);
        IntElement output = (IntElement) op.apply(input);
        assertEquals(-42, output.getValue());
    }

    @Test
    void testNegateDouble() {
        NegateOperation op = new NegateOperation();
        DoubleElement input = new DoubleElement(3.14);
        DoubleElement output = (DoubleElement) op.apply(input);
        assertEquals(-3.14, output.getValue(), 0.0001);
    }
}
