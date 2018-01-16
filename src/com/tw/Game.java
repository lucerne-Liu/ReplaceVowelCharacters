package com.tw;

public class Game {
    private static final String REPLACE_TEXT = "mommy";
    private StringReader reader;

    public String replace(String input){
        String vowels = "aeiou";
        if (input == "a" || input == "e" || input == "i" || input == "o" || input == "u"){
            return REPLACE_TEXT;
        }
        return input;
    }
}
