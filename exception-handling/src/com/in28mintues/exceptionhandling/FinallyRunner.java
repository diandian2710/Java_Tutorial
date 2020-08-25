package com.in28mintues.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {

        Scanner scanner =null;
        try {
            scanner = new Scanner(System.in);
            int[] numbers = {1, 2, 3, 4, 5};
            int number = numbers[6];
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Before scanner close");
            if(scanner!=null){
                scanner.close();
            }
        }
        System.out.println("Just before closing out main");

    }
}
