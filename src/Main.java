package com.tw;

public class Main {

    public static void main(String[] args) throws Exception {
	 Game game = new Game(new StringReader(),new Printer());
	 game.start();
    }
}
