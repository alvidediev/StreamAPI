package org.dediev.functionalProgramming1.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Вернуть список целых чисел, опуская те, которые меньше 0.
 */

public class NoNeg {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(5);
        lists.add(0);
        lists.add(-1);
        lists.add(3);
        System.out.println(noNeg(lists));
    }
    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }
}
