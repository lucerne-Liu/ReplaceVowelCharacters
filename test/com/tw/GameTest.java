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
    //输入一个元音，返回mommy
    @Test
    public void shouldReturnMommyWhenInputSingleVowel(){
        assertEquals("mommy",game.replace("e") );
    }
    //输入一个元音超过30%字符串，预期元音被替换
    @Test
    public void shouldRepleceVowelWhenHasVowelsOver30Percent(){
        assertEquals("shmommy", game.replace("she"));
    }
    //输入一个元音超过30%，并存在连续元音字符，预期连续的元音字符只被替换一次
    @Test
    public void shouldReplaceOnceWhenhasContinuousVowels(){
        assertEquals("hmommyr",game.replace("hear") );
    }
    //输入元音不超过30%，返回原字符串
    @Test
    public void shouldReturnTheSameWhenVowelsLessThan30Percent(){
        assertEquals("asss", game.replace("asss"));
    }
}