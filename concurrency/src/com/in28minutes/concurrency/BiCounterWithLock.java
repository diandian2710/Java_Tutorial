package com.in28minutes.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();
    public void incrementI(){
        //Get Lock For I
        lockForI.lock();
        i++;
        lockForI.unlock();
        //Release Lock For I
    }
     public void incrementJ(){
        //Get Lock For J
        lockForJ.lock();
        j++;
        lockForJ.unlock();
        //Release Lock For J
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
