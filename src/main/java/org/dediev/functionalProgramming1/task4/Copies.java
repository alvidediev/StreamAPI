package org.dediev.functionalProgramming1.task4;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
 */
public class Copies {
    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s + s + s).collect(Collectors.toList());
    }
}
