package com.tw.diamond;

class GenerateLine {

    static String generateLine(String letter, String lineLetter) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < (letter.charAt(0) - 'A') * 2 + 1; i++) {
            stringBuilder.append(" ");
        }

        int firstPosition = letter.charAt(0) - lineLetter.charAt(0);
        int secondPosition = stringBuilder.length() - 1 - (letter.charAt(0) - lineLetter.charAt(0));

        stringBuilder.setCharAt(firstPosition, lineLetter.charAt(0));
        stringBuilder.setCharAt(secondPosition, lineLetter.charAt(0));

        return stringBuilder.toString();

    }
}