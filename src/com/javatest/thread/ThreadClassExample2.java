package com.javatest.thread;

public class ThreadClassExample2 implements Runnable {
    public static void main(String[] args) {
        //create an object of the class
        Runnable r1 = new ThreadClassExample2();
        //create and object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1, "My new thread");
        //the start() method moves the thread to the active state
        th1.start();
        //getting the thread name by invoking the getName() method
        String str = th1.getName();
        System.out.println(str);
    }

    @Override
    public void run() {
        System.out.println("Now the thread is running ...");
    }
}
