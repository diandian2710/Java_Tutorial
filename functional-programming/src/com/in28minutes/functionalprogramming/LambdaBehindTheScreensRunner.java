package com.in28minutes.functionalprogramming;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
class EvenNumberPredicate implements Predicate<Integer>{

    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }
}
class SystemOurConsumer implements Consumer<Integer>{

    @Override
    public void accept(Integer number) {
        System.out.println(number);
    }
}
class NumberSquareMethod implements Function<Integer, Integer>{

    @Override
    public Integer apply(Integer number) {
        return number * number;
    }
}
public class LambdaBehindTheScreensRunner {
    public static void main(String[] args) {
        //Storing functions in variables
        Predicate<Integer> evenPredicate = createEvenPredicate();

        List.of(23,12,32,534,23).stream().filter(evenPredicate).map(n -> n*n).forEach(e -> System.out.println(e));
        List.of(23,12,324,23).stream().filter(new EvenNumberPredicate()).map(new NumberSquareMethod()).forEach(new SystemOurConsumer());
//        .filter(new EvenNumberPredicate())
//        Stream<T> filter(Predicate<? super T> predicate);
//        boolean test(T t);

//        .forEach(e -> System.out.println(e))
//        void forEach(Consumer<? super T> action);
//        void accept(T t);

//        .map(n -> n*n)
//    <R> Stream<R> map(Function<? super T, ? extends R> mapper);
//        public interface Function<T, R> {
    }
//        Returning functions from methods
    private static Predicate<Integer> createEvenPredicate() {
        return n -> n % 2 == 0;
    }
}
