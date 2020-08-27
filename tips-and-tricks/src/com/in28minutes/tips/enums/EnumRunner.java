package com.in28minutes.tips.enums;

import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        Season season = Season.FAIL;
        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(season1.name());
        System.out.println(season1.ordinal());
        System.out.println(season1.SPRING.ordinal());
        System.out.println(Arrays.toString(season.values()));
        System.out.println(Season.SPRING.getValue());
    }

}
