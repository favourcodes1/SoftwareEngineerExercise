package org.favourogubuike.operations;

import org.favourogubuike.types.*;

public class CapitalizeOperation implements Operation {

    @Override
    public DataElement<?> apply(DataElement<?> input) {
        if (!(input instanceof StringElement)) {
            throw new IllegalArgumentException("Capitalize only supports string input.");
        }

        String[] words = ((StringElement) input).getValue().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1).toLowerCase())
              .append(" ");
        }

        return new StringElement(sb.toString().trim());
    }
}
