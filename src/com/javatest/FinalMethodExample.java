package com.javatest;

public class FinalMethodExample {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}

class Bike{
    final void run(){
        System.out.println("running");
    }
}
class Honda extends Bike{
        //we can't override a final method
//    void run(){
//        System.out.println("running safely with 100kmph");
//    }
}