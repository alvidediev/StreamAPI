package org.dediev.functionalProgramming1.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list where each integer is multiplied by 2.
 */

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }
}
