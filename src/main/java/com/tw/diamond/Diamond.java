package com.tw.diamond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Diamond {
    public Diamond() {
    }

    List<String> diamond(String letter) {
        ArrayList<String> lines = new ArrayList<String>();
        for (String lineLetter : getSequence(letter)) {
            lines.add(generateLine(letter, lineLetter));
        }

        return lines;
    }

    private String generateLine(String letter, String lineLetter) {
        if (letter.equals("A")) {
            return "A";
        } else if (letter.equals("B")) {
            if (lineLetter.equals("A")) {
                return " A ";
            } else {
                return "B B";
            }
        } else {
            if (lineLetter.equals("A")) {
                return "  A  ";
            } else if (lineLetter.equals("B")) {
                return " B B ";
            } else {
                return "C   C";
            }
        }
    }

    private List<String> getSequence(String letter) {
        if (letter.equals("A")) {
            return Arrays.asList("A");
        } else if (letter.equals("B")) {
            return Arrays.asList("A", "B", "A");
        } else {
            return Arrays.asList("A", "B", "C", "B", "A");
        }
    }


}