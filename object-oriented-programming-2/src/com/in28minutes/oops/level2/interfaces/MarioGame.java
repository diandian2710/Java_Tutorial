package com.in28minutes.oops.level2.interfaces;

public class MarioGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Down");

    }

    @Override
    public void left() {
        System.out.println("Left");

    }

    @Override
    public void right() {
        System.out.println("Right");

    }
}
