package com.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        printBasic(list);
        printWithFP(list);
        printWithFPWithFiltering(list);
    }

    private static void printBasic(List<String> list) {
        for(String string: list){
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream(). forEach(
                element -> System.out.println(element)); //this is action
    }

    private static void printWithFPWithFiltering(List<String> list) {
        list.stream()
                .filter(
                        element -> element.endsWith("at")
                        )
                . forEach(
                        element -> System.out.println(element)
                        ); //this is action
    }
}


