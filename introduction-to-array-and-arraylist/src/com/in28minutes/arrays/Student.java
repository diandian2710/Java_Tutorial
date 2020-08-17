package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student {
    private String name;
    private  ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks(){
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for(int mark: marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
//        int max = Integer.MIN_VALUE;
//        for(int mark:marks){
//            if( max < mark){
//                max = mark;
//            }
//        }
//        return max;
        return Collections.max(marks);

    }

    public int getMinimumMark() {
//        int min = Integer.MAX_VALUE;
//        for(int mark:marks){
//            if(min > mark){
//                min = mark;
//            }
//        }
//        return min;
        return Collections.min(marks);
    }

    public BigDecimal getAverageMarks() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP);
    }
    public String toString(){
        return name + marks;
    }

    public void addNewMark(int mark){
        marks.add(mark);
    }
    public void removeMark(int index){
        marks.remove(index);
    }
}