package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number1:");
        int number1 = scanner.nextInt();
        System.out.println("The number you enter is - " + number1);
        System.out.println("enter number2");
        int number2 = scanner.nextInt();
        System.out.println("the number you enter is -" + number2);
        System.out.println("Choose Operation");
        int number3 = scanner.nextInt();
        performanceOperationUsingSwitch(number1, number2, number3);
    }

    private static void performanceOperationUsingNestedIfElse(int number1, int number2, int number3) {
        if (number3 == 1) {
            System.out.println("Result" + (number1 + number2));
        } else if (number3 == 2) {
            System.out.println("Result" + (number1 - number2));
        } else if (number3 == 3) {
            System.out.println("Result" + (number1 * number2));
        } else if (number3 == 4) {
            System.out.println("Result" + (number1 / number2));
        } else {
            System.out.println("Invalid operation");
        }
    }

    private static void performanceOperationUsingSwitch(int number1, int number2, int number3) {
        switch (number3){
            case 1 : System.out.println("Result" + (number1 + number2));
            break;
            case 2 : System.out.println("Result" + (number1 - number2));
            break;
            case 3 : System.out.println("Result" + (number1 * number2));
            break;
            case 4 : System.out.println("Result" + (number1 / number2));
            break;
            default : System.out.println("Invalid Operation");
            break;
        }
    }
}
