package com.exercise.oops;

public class MotorBike {
    //state
    private int speed; //member variable
    MotorBike(int speed){
        this.speed = speed;
    }

    void setSpeed(int speed){ //local varibale
        if(speed > 0)
            this.speed = speed;
//        System.out.println(speed);
//        System.out.println(this.speed);
    }

    public int getSpeed() {
        return this.speed;
    }

    public void increaseSpeed(int increasement){
        this.speed = this.speed + increasement;
        System.out.println(getSpeed());

    }

    public void decreaseSpeed(int decreasement){
        if (this.speed > decreasement)
            this.speed = this.speed - decreasement;
    }
    //behavior
    void start(){

        System.out.println("Bike Start");
    }
    void stop(){

    }
}