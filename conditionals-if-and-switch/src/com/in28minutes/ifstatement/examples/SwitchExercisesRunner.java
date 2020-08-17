package com.in28minutes.ifstatement.examples;

public class SwitchExercisesRunner {

    public static void main(String[] args){
        System.out.println(determineNameOfDay(5));
        System.out.println(determineNameOfMonth(2));
        System.out.println(isWeekday(5));

    }


    public static String determineNameOfDay(int dayNumber){
        String result = "";
        switch (dayNumber){
            case 0 : result = "Sunday";
                break;
            case 1 : result = "Monday";
                break;
            case 2 : result = "Tuesday";
                break;
            case 3 : result = "Wednesday";
                break;
            case 4 : result = "Thursday";
                break;
            case 5 : result = "Friday";
                break;
            case 6 : result = "Saturday";
                break;
        }
        return result;
    }

    public static String determineNameOfMonth(int monthNumber){
        switch (monthNumber){
            case 1 : return "Jan";
            case 2 : return "Feb";
            case 3 : return "Mar";
            case 4 : return "Apr";
        }
        return "Invalid_month";
    }

    public static boolean isWeekday(int dayNumber){
        switch (dayNumber){
            case 0 :
            case 6 : return false;
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 : return true;
        }
        return false;
    }
}
