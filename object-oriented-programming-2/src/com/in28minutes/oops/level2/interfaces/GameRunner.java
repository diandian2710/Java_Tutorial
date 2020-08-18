package com.in28minutes.oops.level2.interfaces;

public class GameRunner {
    public static void main(String[] args) {
//        MarioGame game = new MarioGame();
//        game.up();
//        game.down();
//        game.left();
//        game.right();
//
//        ChessGame gamec = new ChessGame();
//        gamec.up();
//        gamec.down();
//        gamec.left();
//        gamec.right();

        GamingConsole game = new ChessGame();
        game.up();
        game.down();
        game.left();
        game.right();

    }
}
