package org.dediev.functionalProgramming1.Task9;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y" + s + "y").collect(Collectors.toList());
    }
}
