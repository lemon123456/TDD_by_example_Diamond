package com.tw.diamond;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiamondTest {
    private final Diamond diamond = new Diamond(new GenerateLine(' '));

    @Test
    public void print_diamong_for_A() throws Exception {
        assertEquals(Arrays.asList("A"), diamond.diamond("A"));

    }

    @Test
    public void print_diamong_for_B() throws Exception {
        assertEquals(Arrays.asList(" A ",
                                   "B B",
                                   " A "), diamond.diamond("B"));

    }

    @Test
    public void print_diamong_for_C() throws Exception {
        assertEquals(Arrays.asList("  A  ",
                                   " B B ",
                                   "C   C",
                                   " B B ",
                                   "  A  "), diamond.diamond("C"));

    }

    @Test
    public void print_super_diamong_for_C() throws Exception {
        Diamond diamond = new Diamond(new GenerateLine('*'));
        assertEquals(Arrays.asList("  A  ",
                                   " B*B ",
                                   "C***C",
                                   " B*B ",
                                   "  A  "), diamond.diamond("C"));

    }

}
