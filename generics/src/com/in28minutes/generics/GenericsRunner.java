package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {
    static <X>X doubleValue(X value){
        return value;
    }

    static <X extends List> void duplicate(X list){
        list.addAll(list);
    }

    static double sumOfNumberList(List<? extends Number> numbers){
       double sum = 0.0;
       for(Number number:numbers){
           sum += number.doubleValue();
       }
       return sum;
    }
    static void addCoupleOfValues(List<? super Number> numbers){
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNumberList(List.of(1,2,3,4,5,6)));
        System.out.println(sumOfNumberList(List.of(1.1,2.2,3.2,4.4,5.4,6.4)));
        System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));

        String value1 = doubleValue(new String());
        Integer number2 = doubleValue(Integer.valueOf(5));
        ArrayList list1 = doubleValue(new ArrayList());

        ArrayList list3 = new ArrayList<>(List.of(1,2,3,4,5));
        duplicate(list3);
        System.out.println(list3);

        LinkedList list4 = new LinkedList<>(List.of(1,2,3,4,5));
        duplicate(list4);
        System.out.println(list4);

        MyCustomList<Long> list = new MyCustomList();
        list.addElement(5l);
        list.addElement(6l);
//        list.addElement("Element 3");
//        list.addElement("Element 4");
        Long value = list.get(0);
        System.out.println(list);
        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList();
        list2.addElement(Integer.valueOf(4));
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(9));
        Integer number = list2.get(0);
        System.out.println(list2);
        System.out.println(number);

    }
}
