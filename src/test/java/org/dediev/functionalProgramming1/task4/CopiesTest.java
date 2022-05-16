package org.dediev.functionalProgramming1.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopiesTest {

    private Copies test = new Copies();

    @Test
    public void copies3test1() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "a", "bb", "ccc");
        Collections.addAll(result, "aaa", "bbbbbb", "ccccccccc");
        Assertions.assertEquals(result, test.copies3(strings));
    }

    @Test
    public void copies3test2() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "24", "a", "");
        Collections.addAll(result, "242424", "aaa", "");
        Assertions.assertEquals(result, test.copies3(strings));
    }

    @Test
    public void copies3test3() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "hello", "there");
        Collections.addAll(result, "hellohellohello", "theretherethere");
        Assertions.assertEquals(result, test.copies3(strings));
    }
}