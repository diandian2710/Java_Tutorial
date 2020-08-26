package com.in28minutes.concurrency;

public class BiCounter {
    private int i = 0;
    private int j = 0;

    synchronized public void incrementI(){
        i++;
    }
    synchronized public void incrementJ(){
        j++;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
