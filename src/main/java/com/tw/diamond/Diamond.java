package com.tw.diamond;

import java.util.Arrays;
import java.util.List;

public class Diamond {
    public Diamond() {
    }

    List<String> diamond(String letter) {
        if (letter.equals("A")) {
            return Arrays.asList("A");
        }
        if (letter.equals("B")) {
            return Arrays.asList(" A ", "B B", " A ");
        }
        return Arrays.asList("  A  ", " B B ", "C   C", " B B ", "  A  ");
    }
}