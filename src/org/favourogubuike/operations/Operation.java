package org.favourogubuike.operations;

import org.favourogubuike.types.DataElement;

public interface Operation {
    /**
     * Applies this operation to the given input and returns a new data element.
     * @param input the data element to process
     * @return a new data element with the result
     */
    DataElement<?> apply(DataElement<?> input);
}
