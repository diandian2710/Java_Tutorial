package com.in28minutes.tips.access.package1;

public class MethodAccessRunner {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        exampleClass.publicMethod();
        exampleClass.protectedMethod();
//        exampleClass.privatemethod();
        exampleClass.defaultMethod();
    }
}
