package com.kodilla.stream.beautifier;

public class AdvPoemBeautifier {

    public static String beautify(String text) {
        char[] tempText = text.toCharArray();
        for (int i = 0; i < text.length(); i += 2) {
            tempText[i] = Character.toUpperCase(tempText[i]);
        }
        return new String(tempText);
    }
}
