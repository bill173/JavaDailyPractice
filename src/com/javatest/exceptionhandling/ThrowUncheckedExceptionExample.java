package com.javatest.exceptionhandling;

import java.util.Scanner;

public class ThrowUncheckedExceptionExample {
    //a function to check if a person is eligible to vote or not
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        //calling the function
        validate(num);
        System.out.println("rest of the code...");
    }

    public static void validate(int age){
        if (age < 18){
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!");
        }
    }
}
