package com.javatest.exceptionhandling;

public class FinalExample {
    //declaring final variable
    final int age = 18;
    void display() {

        // reassigning value to age variable gives compile time error
        //age = 55;
    }

    public static void main(String[] args) {

        FinalExample obj = new FinalExample();
        // gives compile time error
        obj.display();
    }
}
/**
 * final is the keyword and access modifier
 * which is used to apply restrictions on a class, method or variable.
 */
