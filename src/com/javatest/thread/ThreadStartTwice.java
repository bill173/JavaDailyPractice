package com.javatest.thread;

public class ThreadStartTwice extends Thread {
    public static void main(String[] args) {
     ThreadStartTwice t = new ThreadStartTwice();
     t.start();
     t.start();//IllegalThreadStateException thrown, after starting a thread, it can never be started again
    }
    public void run(){
        System.out.println("running...");
    }
}
