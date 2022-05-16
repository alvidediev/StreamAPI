package org.dediev.functionalProgramming1.task6;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RightDigitTest {

    private RightDigit test = new RightDigit();

    @Test
    public void rightDigitTest1(){
        List<Integer> ints = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(ints, 1, 22, 93);
        Collections.addAll(result, 1, 2, 3);
        Assertions.assertEquals(result, test.rightDigit(ints));
    }

    @Test
    public void rightDigitTest2(){
        List<Integer> ints = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(ints, 16, 8, 886, 8, 1);
        Collections.addAll(result, 6, 8, 6, 8, 1);
        Assertions.assertEquals(result, test.rightDigit(ints));
    }

    @Test
    public void rightDigitTest3(){
        List<Integer> ints = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Collections.addAll(ints, 10, 0);
        Collections.addAll(result, 0, 0);
        Assertions.assertEquals(result, test.rightDigit(ints));
    }
}