package org.favourogubuike.utils;

import org.favourogubuike.operations.OperationFactory;
import org.favourogubuike.types.*;
import org.favourogubuike.Statistics;

import java.util.*;
import java.util.concurrent.Callable;

public class ChunkProcessor implements Callable<List<String>> {
    private final List<String> lines;
    private final String inputType;
    private final String[] operations;
    private final Statistics stats;

    public ChunkProcessor(List<String> lines, String inputType, String[] operations, Statistics stats) {
        this.lines = lines;
        this.inputType = inputType;
        this.operations = operations;
        this.stats = stats;
    }

    @Override
    public List<String> call() {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            DataElement<?> element = TypeFactory.create(inputType, line);
            for (String op : operations) {
                element = OperationFactory.apply(op, element);
            }

            String out = element.toOutputString();
            result.add(out);

            // Add output length to statistics safely
            synchronized (stats) {
                stats.addSample(out.length());
            }
        }
        return result;
    }
}
