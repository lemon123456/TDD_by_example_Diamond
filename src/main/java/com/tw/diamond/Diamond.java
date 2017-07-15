package com.tw.diamond;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Diamond {

    private GenerateLine generateLine;

    public Diamond(GenerateLine generateLine) {
        this.generateLine = generateLine;
    }

    List<String> diamond(String letter) {
        ArrayList<String> lines = new ArrayList<String>();
        for (String lineLetter : getSequence(letter)) {
            lines.add(generateLine.generateLine(letter, lineLetter));
        }
        return lines;
    }

    private List<String> getSequence(String letter) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c = 'A'; c < letter.charAt(0); c++) {
            stringBuilder.append(c);
        }
        String result = stringBuilder.toString() + letter + stringBuilder.reverse().toString();
        return Arrays.asList(result.split(""));
    }


}