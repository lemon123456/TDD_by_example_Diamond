package com.tw.diamond;

class GenerateLine {

    private static char star;

    public GenerateLine(char star) {
        this.star = star;
    }

    static String generateLine(String letter, String lineLetter) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < (letter.charAt(0) - 'A') * 2 + 1; i++) {
            stringBuilder.append(" ");
        }

        int firstPosition = letter.charAt(0) - lineLetter.charAt(0);
        int secondPosition = stringBuilder.length() - 1 - (letter.charAt(0) - lineLetter.charAt(0));

        stringBuilder.setCharAt(firstPosition, lineLetter.charAt(0));
        for (int i=firstPosition+1; i<secondPosition; i++) {
            stringBuilder.setCharAt(i, star);
        }
        stringBuilder.setCharAt(secondPosition, lineLetter.charAt(0));

        return stringBuilder.toString();

    }
}