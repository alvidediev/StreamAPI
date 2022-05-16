package org.dediev.functionalProgramming1.task5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Math1Test {
    private Math1 test = new Math1();

    @Test
    public void mathTest1(){
        List<Integer> integers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3);
        Collections.addAll(result, 20, 30, 40);
        Assertions.assertEquals(result, test.math1(integers));
    }

    @Test
    public void mathTest2(){
        List<Integer> integers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(integers, 6, 8, 6, 8, 1);
        Collections.addAll(result, 70, 90, 70, 90, 20);
        Assertions.assertEquals(result, test.math1(integers));
    }

    @Test
    public void mathTest3(){
        List<Integer> integers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(integers, 10);
        Collections.addAll(result, 110);
        Assertions.assertEquals(result, test.math1(integers));
    }

}