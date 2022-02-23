package com.javatest.multithreading;

public class MultiThreadExample1 extends Thread{
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        MultiThreadExample1 t1=new MultiThreadExample1();
        t1.start();
        t1.start();
    }

}
