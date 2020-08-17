package com.in28mintues.loops;

public class WhileNumberPlayer {
    private final int number;

    public WhileNumberPlayer(int number) {
        this.number = number;
    }

    public void printSquaresUpToLimiti() {
        int i = 1;
        while(i * i < number){
            System.out.println("the number is " + i * i );
            i += 1;
        }
    }

    public void printCubesUpToLimit() {
        int i = 1;
        while(i * i * i < number){
            System.out.println("the number is " + i * i * i );
            i += 1;
        }
    }
}
