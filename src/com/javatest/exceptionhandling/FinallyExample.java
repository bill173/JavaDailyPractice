package com.javatest.exceptionhandling;

public class FinallyExample {
    public static void main(String args[]){
        try{
        //below code do not throw any exception
            int data=25/5;
            System.out.println(data);
        }
        //catch won't be executed
        catch(NullPointerException e){
            System.out.println(e);
        }
        //executed regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
/**
 * finally is the block in Java Exception Handling
 * to execute the important code whether the exception occurs or not.
 */