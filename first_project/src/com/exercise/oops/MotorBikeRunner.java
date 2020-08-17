package com.exercise.oops;

public class MotorBikeRunner {

    public static void main(String[] args){
        MotorBike ducati = new MotorBike(20);
        MotorBike honda = new MotorBike(30);
        System.out.println(honda.getSpeed());
        System.out.println(ducati.getSpeed());



        ducati.start();
        honda.start();
        honda.setSpeed(100);
        ducati.setSpeed(200);
        honda.increaseSpeed(20);
        ducati.increaseSpeed(30);
//    System.out.println(honda.getSpeed());
//    System.out.println(ducati.getSpeed());
//    honda.decreaseSpeed(20);
//    ducati.decreaseSpeed(30);
////    System.out.println(honda.getSpeed());
//    System.out.println(ducati.getSpeed());
//    honda.setSpeed(-80);
//    System.out.println(honda.getSpeed());
//    ducati.setSpeed(100);
//    int ducatispeed = ducati.getSpeed();
//    ducatispeed += 100;
//    ducati.setSpeed(ducatispeed);
//    System.out.println(ducati.getSpeed());
//
//    honda.setSpeed(100);
//    int hondaspeed = honda.getSpeed();
//     hondaspeed+= 100;
//    honda.setSpeed(ducatispeed);
//    System.out.println(honda.getSpeed());

    }
}
