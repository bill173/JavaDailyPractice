package com.javatest;

public class DefaultConstructorExample {
    public static void main(String[] args) {
        Student2 d = new Student2();
    }
}

class Student2{
    Student2() {
        System.out.println("Default Constructor created");
    }
}