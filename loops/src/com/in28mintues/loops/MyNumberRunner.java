package com.in28mintues.loops;

import com.in28mintues.loops.MyNumber;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(4);
        boolean isPrime = number.isPrime();
        System.out.println("isPrime " + isPrime);
        int sum = number.sumUpToN();
        System.out.println(("the summary is " + sum));
        int sumOfDivisor = number.sumOfDivisors();
        System.out.println("the summary of divisors is " + sumOfDivisor);
        number.printANumberTriangle();

    }
}
