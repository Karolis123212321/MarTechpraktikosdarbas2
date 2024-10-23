package com.example.martechpraktikosdarbas2;

public class CountHelper {

    // Metodas žodžių skaičiavimui
    public int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }

    // Metodas rašybos ženklų skaičiavimui
    public int countCharacters(String text) {
        return text.length();
    }
}