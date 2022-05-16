package org.dediev.functionalProgramming1.Task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoXTest {

    private NoX test = new NoX();

    @Test
    public void noXTest1() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "ax", "bb", "cx");
        Collections.addAll(result, "a", "bb", "c");
        Assertions.assertEquals(result, test.noX(strings));
    }

    @Test
    public void noXTest2() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "xxax", "xbxbx", "xxcx");
        Collections.addAll(result, "a", "bb", "c");
        Assertions.assertEquals(result, test.noX(strings));
    }

    @Test
    public void noXTest3() {
        List<String> strings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Collections.addAll(strings, "x");
        Collections.addAll(result, "");
        Assertions.assertEquals(result, test.noX(strings));
    }

}