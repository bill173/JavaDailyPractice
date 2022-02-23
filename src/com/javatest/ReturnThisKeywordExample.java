package com.javatest;

public class ReturnThisKeywordExample {
    public static void main(String[] args) {
        new B().getB().msg();
    }
}
class B{
    B getB(){
        return this;
    }
    void msg(){
        System.out.println("Hello Java.");
    }
}