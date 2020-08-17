package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Ranga", 97, 98 ,99);
        Student student1 = new Student("Ranga", 92, 93 ,94);
        Student student2= new Student("Ranga", 91, 97 ,92);
        Student student3= new Student("Ranga", 97, 98 ,99);
        int number = student.getNumberOfMarks();
        System.out.println("number of marks: " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("sum " + sum);
        int maximumMark = student.getMaximumMark();
        System.out.println("max is " + maximumMark);
        int minimumMark = student.getMinimumMark();
        System.out.println("the min is " + minimumMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println("the average is " + average);
        System.out.println(student);
        student.addNewMark(35);
        System.out.println(student);
        student.removeMark(0);
        System.out.println(student);

    }
}
