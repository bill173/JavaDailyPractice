package com.javatest.thread;

public class ThreadExampleByImplementingRunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        ThreadExampleByImplementingRunnableInterface m1 = new ThreadExampleByImplementingRunnableInterface();
        Thread t1 = new Thread(m1);// Using the constructor Thread(Runnable r)
        t1.start();
    }
}
