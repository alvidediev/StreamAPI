package org.dediev.functionalProgramming1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, return a list where each integer is multiplied with itself.
 */

public class Square {
    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }
}
