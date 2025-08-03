package org.favourogubuike.utils;

import java.util.*;

public class ArgumentParser {
    private final Map<String, String> args = new HashMap<>();

    public ArgumentParser(String[] arguments) {
        for (int i = 0; i < arguments.length - 1; i += 2) {
            args.put(arguments[i].replace("--", ""), arguments[i + 1]);
        }
    }

    public String get(String key) {
        return args.get(key);
    }

    public boolean has(String key) {
        return args.containsKey(key);
    }
}
