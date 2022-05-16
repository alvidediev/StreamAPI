package org.dediev.functionalProgramming1.task3;

import java.util.List;
import java.util.stream.Collectors;

/**
 *Given a list of strings, return a list where each string has "*" added at its end.
 */

public class AddStar {
    public List<String> addStar(List<String> strings) {
        return strings.stream().map(n -> n + "*").collect(Collectors.toList());
    }
}
