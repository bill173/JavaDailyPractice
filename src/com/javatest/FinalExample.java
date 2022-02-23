package com.javatest;

public class FinalExample {
    public static void main(String[] args) {
        Bike9 obj = new Bike9();
        obj.run();
    }
}

class Bike9{
    final int speedlimit = 90;
    void run(){
        //the final variable is used to restrict the user from updating it
        //speedlimit = 400;
    }
}