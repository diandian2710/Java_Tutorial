package com.in28minutes.oops.level2.interfaces;

public class Project {
    public static void main(String[] args) {
        ComplextAlgorithm algorithm = new DummyAlgorithm();
        System.out.println(algorithm.complexAlgorithm(10,20));
    }
}
