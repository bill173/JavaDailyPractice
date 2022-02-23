package com.javatest.thread;
//Java Thread Example by extending Thread class
public class ThreadExampleByExtendingThreadClass extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        ThreadExampleByExtendingThreadClass t1=new ThreadExampleByExtendingThreadClass();
        t1.start();
    }

}
