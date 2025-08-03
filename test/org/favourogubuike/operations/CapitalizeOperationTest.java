package org.favourogubuike.operations;

import org.favourogubuike.types.StringElement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeOperationTest {

    @Test
    void testCapitalizeWords() {
        CapitalizeOperation op = new CapitalizeOperation();

        // Input string to test
        StringElement input = new StringElement("hello world");

        // Apply the operation
        StringElement output = (StringElement) op.apply(input);

        // Assert the capitalized output matches expected
        assertEquals("Hello World", output.getValue());
    }
}
