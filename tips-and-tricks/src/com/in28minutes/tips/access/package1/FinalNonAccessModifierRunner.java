package com.in28minutes.tips.access.package1;

final class FinalClass{

}

class  SomeClass{
    final public void doSomething(){
    }
    public void doSomethingElse(int arg){
        arg = 6;
    }
}

class ExtendingClass extends SomeClass{

}
public class FinalNonAccessModifierRunner {
    public static void main(String[] args) {
        final int i;
        i = 5;
    }
}
