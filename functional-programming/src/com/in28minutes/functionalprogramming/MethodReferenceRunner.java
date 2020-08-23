package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferenceRunner {
    public static void print(Integer number){
        System.out.println(number);
    }
    public static void main(String[] args) {
        List.of("Ant","Dog","Cat","Fish").stream()
                .map(s -> s.length()).forEach(s -> System.out.println(s));
        List.of("Ant","Dog","Cat","Fish").stream()
                .map(String::length).forEach(MethodReferenceRunner::print);
        Integer max = List.of(23,24,25,26,32,65).stream().filter(n -> n%2==0).max((n1,n2) -> Integer.compare(n1,n2)).orElse(0);
        System.out.println(max);
        Integer maxRef = List.of(23,24,25,26,32,65).stream().filter(MethodReferenceRunner::isEven)
                .max(Integer::compareTo).orElse(0);
    }

    public static boolean isEven(Integer number){
       return number%2==0;
    }


}
