package org.favourogubuike.operations;

import org.favourogubuike.types.StringElement;
import org.favourogubuike.types.IntElement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseOperationTest {

    @Test
    void testReverseString() {
        ReverseStringOperation op = new ReverseStringOperation();
        StringElement input = new StringElement("abc");
        StringElement output = (StringElement) op.apply(input);
        assertEquals("cba", output.getValue());
    }

    @Test
    void testReverseInteger() {
        ReverseIntOperation op = new ReverseIntOperation();
        IntElement input = new IntElement(120);
        IntElement output = (IntElement) op.apply(input);
        assertEquals(21, output.getValue());
    }
}
