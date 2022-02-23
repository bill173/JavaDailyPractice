package com.javatest;

public class Covariant{
    public static void main(String[] args) {
        new B1().get().message();
        //new B1().get();
        new A1().get();
        new B1().message();
    }
}

class A1{
    A1 get(){
        System.out.println("Welcome!");
        return this;
    }
}

class B1 extends A1{
    B1 get(){return this;}
    void message(){
        System.out.println("Welcome to covariant return type");
    }
}