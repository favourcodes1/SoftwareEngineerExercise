package org.favourogubuike;

import java.util.*;

/**
 * Captures statistics about the lines being read from the input file,
 * as well as output length metrics (min, max, avg, stddev).
 * 
 * Combines both input and output statistics into one singleton class.
 * 
 * Author: KNIME GmbH, extended by Favour Ogubuike
 */
public class Statistics {

	private static Statistics instance;

	private final Set<String> linesRead = new HashSet<>();
	private int lineCounter;

	private final List<Integer> samples = new ArrayList<>();

	private Statistics() {
		// private constructor
	}

	// Singleton getter
	public static synchronized Statistics getInstance() {
		if (instance == null) {
			instance = new Statistics();
		}
		return instance;
	}

	// --- Input Line Statistics ---
	public synchronized void updateStatisticsWithLine(final String line) {
		lineCounter++;
		linesRead.add(line);
	}

	public synchronized int getNoOfLinesRead() {
		return lineCounter;
	}

	public synchronized int getNoOfUniqueLines() {
		return linesRead.size();
	}

	// --- Output Sample Statistics ---
	public synchronized void addSample(int value) {
		samples.add(value);
	}

	public synchronized int getMin() {
		if (samples.isEmpty()) return 0;
		return Collections.min(samples);
	}

	public synchronized int getMax() {
		if (samples.isEmpty()) return 0;
		return Collections.max(samples);
	}

	public synchronized double getAverage() {
		if (samples.isEmpty()) return 0;
		return samples.stream().mapToInt(Integer::intValue).average().orElse(0.0);
	}

	public synchronized double getStandardDeviation() {
		if (samples.size() < 2) return 0.0;
		double avg = getAverage();
		double sumSq = samples.stream()
			.mapToDouble(i -> Math.pow(i - avg, 2))
			.sum();
		return Math.sqrt(sumSq / (samples.size() - 1));
	}

	@Override
	public synchronized String toString() {
		return String.format("""
			Input Statistics:
			Lines Read: %d
			Unique Lines: %d

			Output Length Statistics:
			Count: %d
			Min: %d
			Max: %d
			Average: %.2f
			StdDev: %.2f
			""", lineCounter, getNoOfUniqueLines(),
				samples.size(), getMin(), getMax(), getAverage(), getStandardDeviation());
	}
}
