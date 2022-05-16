package org.dediev.functionalProgramming1.task2;

import java.util.ArrayList;
import java.util.List;

public class NoNine {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(5);
        lists.add(0);
        lists.add(9);
        lists.add(19);
        lists.add(-1);
        lists.add(3);
        System.out.println(no9(lists));
    }

    public static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(n -> n % 10 == 9);
        return nums;
    }
}
