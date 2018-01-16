package com.tw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
    private static final String REPLACE_TEXT = "mommy";
    private StringReader reader;

    public String replace(String input){
        String vowels = "aeiouAEIOU";
        String regx = "[aeiouAEIOU]+";
        float vowelsCount = 0;
        for(int i = 0 ; i < input.length() ; i++){
            if (vowels.contains(input.substring(i,i+1))){
                vowelsCount++;
            }
        }
        if (vowelsCount/input.length() > 0.3){
            return input.replaceAll(regx, REPLACE_TEXT);
        }else{
            return  input;
        }

    }
}
