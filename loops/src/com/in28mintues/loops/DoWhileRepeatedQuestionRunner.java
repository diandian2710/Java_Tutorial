package com.in28mintues.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        do {
            if(number != -1){
                System.out.println("Cube is "+(number * number * number));
            }
            System.out.println("enter a number: ");
            number = scanner.nextInt();
        }while(number >= 0);
        System.out.println("thank you");
        List list = new ArrayList();
    }
}
