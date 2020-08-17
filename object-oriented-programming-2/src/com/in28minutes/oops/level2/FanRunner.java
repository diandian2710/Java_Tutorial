package com.in28minutes.oops.level2;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufactureer 1", 0.333, "Red");
        fan.switchOn();
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
        fan.setSpeed((byte) 5);
        System.out.println(fan);

    }
}
