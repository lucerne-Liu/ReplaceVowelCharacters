package com.tw;

public class Game {
    private static final String REPLACE_TEXT = "mommy";
    private StringReader reader;
    private Printer printer;
    public Game(){ }
    public Game(StringReader reader,Printer printer){
        this.reader = reader;
        this.printer = printer;
    }
    public float checkVowelPercent(String input){
        String vowels = "aeiouAEIOU";
        float vowelsCount = 0;
        for(int i = 0 ; i < input.length() ; i++){
            if (vowels.contains(input.substring(i,i+1))){
                vowelsCount++;
            }
        }
        return vowelsCount/input.length();
    }
    public String replace(String input){
        String regx = "[aeiouAEIOU]+";
        if ( checkVowelPercent(input) > 0.3 ){
            return input.replaceAll(regx, REPLACE_TEXT);
        }else{
            return  input;
        }

    }
    public void start() throws Exception{
        printer.print("Please input a string of letters(a-zA-Z):");
        String result = replace(reader.read());
        printer.print("Result After replacing:");
        printer.print(result);
    }
}
