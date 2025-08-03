package org.favourogubuike;

import org.favourogubuike.types.*;
import org.favourogubuike.operations.OperationFactory;
import org.favourogubuike.utils.TypeFactory;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Main class.
 * 
 * @author KNIME GmbH
 */
public class Main {

	public static void main(String[] args) throws IOException {
		// ---- CONFIGURATION ----
		String inputPath = "input.txt";
		String outputPath = "output.txt";
		String inputType = "string";  // "string", "int", or "double"
		String[] operations = {"capitalize", "reverse"}; // Operations to apply

		// ---- STATISTICS TRACKING ----
		Statistics stats = Statistics.getInstance();

		// ---- INPUT PROCESSING ----
		List<String> lines = Files.readAllLines(Paths.get(inputPath));
		List<String> results = new ArrayList<>();

		for (String line : lines) {
			stats.updateStatisticsWithLine(line); // ✅ Correct method call

			// Parse line
			DataElement<?> data = TypeFactory.create(inputType, line);

			// Apply operations
			for (String op : operations) {
				data = OperationFactory.apply(op, data);
			}

			// Save result
			results.add(data.toOutputString());
		}

		// ---- WRITE OUTPUT ----
		Files.write(Paths.get(outputPath), results);

		// ✅ DO NOT CHANGE THIS BLOCK
		System.out.println(String.format("Processed %d lines (%d of which were unique)", //
				stats.getNoOfLinesRead(), //
				stats.getNoOfUniqueLines()));
	}
}