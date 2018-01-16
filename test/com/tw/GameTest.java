package com.tw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {
    private Game game = new Game();
    //输入一个非元音，返回字母本身
    @Test
    public void shouldReturnTheSameWhenHasNoneVowels(){
        assertEquals("hmm", game.replace("hmm"));
    }
}