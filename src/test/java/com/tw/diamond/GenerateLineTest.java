package com.tw.diamond;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GenerateLineTest {

    private GenerateLine generateLine = new GenerateLine(' ');

    @Test
    public void generate_line_for_letter_A_and_lineletter_A() throws Exception {
        assertEquals("A", generateLine.generateLine("A", "A"));
    }

    @Test
    public void generate_line_for_letter_B_and_lineletter_A() throws Exception {
        assertEquals(" A ", GenerateLine.generateLine("B", "A"));
    }

    @Test
    public void generate_line_for_letter_C_and_lineletter_A() throws Exception {
        assertEquals("  A  ", GenerateLine.generateLine("C", "A"));
    }

    @Test
    public void generate_line_for_letter_C_and_lineletter_B() throws Exception {
        assertEquals(" B B ", GenerateLine.generateLine("C", "B"));
    }

    @Test
    public void generate_line_for_letter_C_and_lineletter_C() throws Exception {
        assertEquals("C   C", GenerateLine.generateLine("C", "C"));
    }
}
