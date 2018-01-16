package com.tw;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringReader {
    private Scanner scanner = new Scanner(System.in);

    public String read() throws Exception {
        String inputNumber = scanner.next();
        if (inputNumber.length() <= 10 && inputNumber.length() >= 0) {
            return inputNumber;
        }
        throw new Exception("Invalid Input");
    }
}
