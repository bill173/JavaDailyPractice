package com.javatest;

public class FinalClassExample {
    public static void main(String[] args) {
        Honda1 honda= new Honda1();
        honda.run();
    }
}
//If we make class Bike1 final, we can't inherit it into any of the subclasses.
class Bike1{
}

class Honda1 extends Bike1 {
    void run() {
        System.out.println("running safely with 100kmph");
    }
}