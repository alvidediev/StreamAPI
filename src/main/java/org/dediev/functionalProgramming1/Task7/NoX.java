package org.dediev.functionalProgramming1.Task7;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has all its "x" removed.
 */

public class NoX {
    public List<String> noX(List<String> strings) {
        return strings.stream().map(s -> s.replace("x", "")).collect(Collectors.toList());
    }
}
