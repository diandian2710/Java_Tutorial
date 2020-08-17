package com.exercise.oops;

public class Bookrunner {
    public static void main(String[] args){
        Book artOfComputerProgramming = new Book(20);
        Book effectiveJava = new Book(30);
        Book cleanCodfe = new Book(40);
        artOfComputerProgramming.setNoOfCopites(100);
        effectiveJava.setNoOfCopites(50);
        cleanCodfe.setNoOfCopites(30);
    }
}
