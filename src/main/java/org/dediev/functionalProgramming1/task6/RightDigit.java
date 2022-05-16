package org.dediev.functionalProgramming1.task6;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, return an integer list of the rightmost digits.
 */

public class RightDigit {
    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(n -> n % 10).collect(Collectors.toList());
    }
}
