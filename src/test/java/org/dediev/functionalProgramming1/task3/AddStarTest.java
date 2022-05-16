package org.dediev.functionalProgramming1.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddStarTest {

    AddStar test = new AddStar();

    @Test
    public void addStarTest1() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "a", "bb", "ccc");
        Collections.addAll(result, "a*", "bb*", "ccc*");
        Assertions.assertEquals(result, test.addStar(strings));
    }

    @Test
    public void addStarTest2() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "hello", "there");
        Collections.addAll(result, "hello*", "there*");
        Assertions.assertEquals(result, test.addStar(strings));
    }

    @Test
    public void addStarTest3() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "*");
        Collections.addAll(result, "**");
        Assertions.assertEquals(result, test.addStar(strings));
    }
}