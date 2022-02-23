package com.javatest.exceptionhandling;

public class TryCatchExample {
    public static void main(String[] args) {
        //In this example, 100/0 raises an ArithmeticException which is handled by a try-catch block.
        try {
            //code that may raise exception
            int data = 100 / 0;//may throw exception here
            // if exception occurs, the remaining statement will not execute
            System.out.println("rest of the code inside try");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        //rest code of the program will be executed
        System.out.println("rest of the code...");
    }
}
/**
 * Common Scenarios of Java Exceptions:
 *
 * int a=50/0;//ArithmeticException
 *
 * String s=null;
 * System.out.println(s.length());//NullPointerException
 *
 * String s="abc";
 * int i=Integer.parseInt(s);//NumberFormatException
 *
 * int a[]=new int[5];
 * a[10]=50; //ArrayIndexOutOfBoundsException
 *--------------------------------------------------------
 * Types of Java Exceptions
 * https://www.javatpoint.com/exception-handling-in-java
 *
 * Difference between Checked and Unchecked Exceptions
 * 1) Checked Exception
 * The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
 *
 * 2) Unchecked Exception
 * The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
 *
 * 3) Error
 * Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.
 */