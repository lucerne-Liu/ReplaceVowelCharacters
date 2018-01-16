package com.tw;

import org.junit.Before;
import org.junit.Test;
import sun.reflect.annotation.ExceptionProxy;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

import static org.junit.Assert.*;

public class StringReaderTest {
    private StringReader reader;
    @Before
    public final void before(){
        reader = new StringReader();
    }
    private void setInputStream(String input) throws NoSuchFieldException, IllegalAccessException {
        Field scannerField = reader.getClass().getDeclaredField("scanner");
        scannerField.setAccessible(true);
        Scanner scannerWithMockedStream = new Scanner(new ByteArrayInputStream(input.getBytes()));
        scannerField.set(reader, scannerWithMockedStream);
    }
    @Test
    public void shouldReadString() throws Exception{
        setInputStream("asss");
        assertEquals("asss", reader.read());
    }
    //length between 0-10
    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenLengthGreaterThan10() throws Exception{
        setInputStream("jjjjjjjjjjj");
        reader.read();
    }
    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenNonLetterInput() throws Exception{
        setInputStream("1234");
        reader.read();
    }
}