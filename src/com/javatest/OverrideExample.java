package com.javatest;

class Base {
    void method(int a){
        System.out.println("Base class method called with integer a = " + a);
    }
    void method(double b){
        System.out.println("Base class method called with double b = " + b);
    }
}

class Derived extends Base{
    @Override
    void method(int c){
        System.out.println("Derived class method called with int c = " + c);
    }
    void method(double d){
        System.out.println("Derived class method called with double d = " + d);
    }
}

public class OverrideExample{
    public static void main(String[] args) {
        new Base().method(1);
        new Base().method(1.2);
        new Derived().method(10);
        new Derived().method(10.2);
    }
}