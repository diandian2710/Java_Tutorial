package com.in28minutes.tip.com.in28minutes.tips.access.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//class LengthComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String str1, String str2) {
//        return Integer.compare(str1.length(), str2.length());
//    }
//}
public class AnonymousClassRunner {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>(List.of("cart", "Elephant", "apple","fat"));
//        Collections.sort(animals, new LengthComparator());
        Comparator<String> lengthComparator = new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Collections.sort(animals, lengthComparator);
        System.out.println(animals);
        };

    }

