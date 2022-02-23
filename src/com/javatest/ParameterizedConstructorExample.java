package com.javatest;

public class ParameterizedConstructorExample {
    public static void main(String[] args) {
        Student3 s01 = new Student3(111, "bill");
        Student3 s02 = new Student3(222, "nathan");

        s01.display();
        s02.display();
    }
}

class Student3{
    int id;
    String name;
    Student3(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id + " " + name);
    }
}