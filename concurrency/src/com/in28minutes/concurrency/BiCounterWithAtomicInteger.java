package com.in28minutes.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithAtomicInteger {
    private  AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();
    public void incrementI(){
        //Get Lock For I
        lockForI.lock();
        i.incrementAndGet();
        lockForI.unlock();
        //Release Lock For I
    }
     public void incrementJ(){
        //Get Lock For J
        lockForJ.lock();
        j.incrementAndGet();
        lockForJ.unlock();
        //Release Lock For J
    }

    public int getI() {
        return i.get();
    }

//    public void setI(int i) {
//        this.i = i;
//    }

    public int getJ() {
        return j.get();
    }

//    public void setJ(int j) {
//        this.j = j;
//    }
}
