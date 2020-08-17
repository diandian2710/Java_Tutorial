package com.in28minutes.arrays;

public class StringRunner {
    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayWithMostCharacter = "";
        for(String day: daysOfWeek){
            if(day.length() > dayWithMostCharacter.length()){
                dayWithMostCharacter = day;
            }
        }
        System.out.println("Day with most number of characters " + dayWithMostCharacter);
        for(int i = 0; i < daysOfWeek.length; i++){
            System.out.println(daysOfWeek[i]);
        }
    }
}
