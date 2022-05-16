package org.dediev.functionalProgramming1.Task8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LowerTest {

    private Lower test = new Lower();

    @Test
    public void lowerTest1() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "Hello", "Hi");
        Collections.addAll(result, "hello", "hi");
        Assertions.assertEquals(result, test.lower(strings));
    }

    @Test
    public void lowerTest2() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "AAA", "BBB", "ccc");
        Collections.addAll(result, "aaa", "bbb", "ccc");
        Assertions.assertEquals(result, test.lower(strings));
    }

    @Test
    public void lowerTest3() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "KitteN", "ChocolaTE");
        Collections.addAll(result, "kitten", "chocolate");
        Assertions.assertEquals(result, test.lower(strings));
    }
}