package com.javatest.thread;

public class ThreadSleepMethod extends Thread{
    public static void main(String[] args) {
        ThreadSleepMethod t1 = new ThreadSleepMethod();
        ThreadSleepMethod t2 = new ThreadSleepMethod();
        t1.start();
        t2.start();
    }

    public void run(){
        for(int i= 1;i < 5;i++){
            //the thread will sleep for 500milli seconds
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
/**
 * Reason for this:
 * As you know well that at a time only one thread is executed.
 * If you sleep a thread for the specified time,
 * the thread scheduler picks up another thread and so on.
 */
