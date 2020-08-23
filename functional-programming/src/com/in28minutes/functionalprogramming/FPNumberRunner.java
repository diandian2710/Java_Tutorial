package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,5,6,13);
//        numbers.stream().forEach(element -> System.out.println(element));
//        int sum = numbers.stream().reduce(0, (number1, number2) -> number1+number2);
        int sum = fpSum(numbers);
//        int sum = normalSum(numbers);
        System.out.println(sum);
    }

    private static int fpSum(List<Integer> numbers) {
        return numbers.stream().filter(element -> element%2==1).reduce(0,(number1, number2) ->{
            System.out.println(number1 + " " + number2);
            return number1 + number2;
        } );
    }
    // just saying what to do
    // avoid mutation(no value changing)

    private static int normalSum(List<Integer> numbers) { //mutation
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }
    // not only what to do but also how to do it
    // allow mutation(value changing)
}
