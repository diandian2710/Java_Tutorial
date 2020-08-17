package com.exercise.oops;

public class Book {
    private int copies;
    Book(int copies){
        this.copies = copies;
        System.out.println(this.copies);
    }
    void setNoOfCopites(int copies){
        this.copies = copies;
        System.out.printf("the copies is %d", copies).println();
    }
}
