package com.tw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
    private static final String REPLACE_TEXT = "mommy";
    private StringReader reader;

    public String replace(String input){
        String vowels = "aeiou";
        String regx = "[aeiouAEIOU]+";
        return input.replaceAll(regx, REPLACE_TEXT);
    }
}
