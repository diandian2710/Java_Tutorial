package com.in28minutes.primitive.datatypes;

public class MyCharrunner {
    public static void main(String[] args){
        MyChar myChar = new MyChar('x');
        System.out.println(myChar.isVowel());
        System.out.println(myChar.isNumber());
        System.out.println(myChar.isAlphabet());
        System.out.println(myChar.isConsonant());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();


    }

}