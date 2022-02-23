package com.javatest.exceptionhandling;

public class TryCatchParentClassExceptionExample {
    public static void main(String[] args) {
        try
        {
            int data=50/0; //may throw exception
        }
        // handling the exception by using Exception class
        catch(Exception e)
        {
            System.out.println(e);
            //this line will enclose exception code in a catch block.
            //int data2=50/0; //may throw exception
        }
        System.out.println("rest of the code");
    }

}
