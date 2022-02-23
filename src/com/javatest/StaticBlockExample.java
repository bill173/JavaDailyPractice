package com.javatest;

public class StaticBlockExample {
    public static void main(String[] args) {
        System.out.println("hello main method");
    }
    static {
        System.out.println("static block is invoked");
    }
}
/**
 * Java static block
 * 1. used to initialize the static data member
 * 2. it is executed before main method at the time class loading
 */