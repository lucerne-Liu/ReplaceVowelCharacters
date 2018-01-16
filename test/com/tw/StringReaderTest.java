package com.tw;

import org.junit.Before;
import org.junit.Test;

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
    @Test
    public void shouldThrowExceptionWhenLengthLessThan0() throws Exception{

    }

}