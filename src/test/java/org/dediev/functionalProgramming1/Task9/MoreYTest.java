package org.dediev.functionalProgramming1.Task9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoreYTest {

    private MoreY test = new MoreY();

    @Test
    public void moreYTest1() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "a", "b", "c");
        Collections.addAll(result, "yay", "yby", "ycy");
        Assertions.assertEquals(result, test.moreY(strings));
    }

    @Test
    public void moreYTest2() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "hello", "there");
        Collections.addAll(result, "yhelloy", "ytherey");
        Assertions.assertEquals(result, test.moreY(strings));
    }

    @Test
    public void moreYTest3() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "yay");
        Collections.addAll(result, "yyayy");
        Assertions.assertEquals(result, test.moreY(strings));
    }
}