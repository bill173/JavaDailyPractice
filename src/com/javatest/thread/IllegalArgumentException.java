package com.javatest.thread;

public class IllegalArgumentException extends Thread {
    // the main method
    public static void main(String args[]) {

// Now, priority of the main thread is set to 17, which is greater than 10
        Thread.currentThread().setPriority(17);

// The current thread is retrieved
// using the currentThread() method

// displaying the main thread priority
// using the getPriority() method of the Thread class
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
    }
}
/**
 *  if the value of the parameter newPriority of the method getPriority() goes out of the range (1 to 10),
 *  then we get the IllegalArgumentException. Let's observe the same with the help of an example.
 */