package org.dediev.functionalProgramming1.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoublingTest {

    private Doubling test = new Doubling();

    @Test
    public void squareTest1() {
        List<Integer> integers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3);
        Collections.addAll(result, 2, 4, 6);
        Assertions.assertEquals(result, test.doubling(integers));
    }

    @Test
    public void squareTest2() {
        List<Integer> integers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(integers, 6, 8, 6, 8, -1);
        Collections.addAll(result, 12, 16, 12, 16, -2);
        Assertions.assertEquals(result, test.doubling(integers));
    }

    @Test
    public void squareTest3() {
        List<Integer> integers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(integers, 0);
        Collections.addAll(result, 0);
        Assertions.assertEquals(result, test.doubling(integers));
    }

}