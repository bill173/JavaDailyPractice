package com.javatest;

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Student5 s01 = new Student5(111,"bill");
        Student5 s02 = new Student5(222,"nathan",30);

    }
}
class Student5{
    int id;
    String name;
    int age;
    Student5(int i, String n){
        id = i;
        name = n;
        System.out.println(id + " " + name);
    }
    Student5(int i, String n, int a){
        id = i;
        name = n;
        age = a;
        System.out.println(id + " " + name + " " + age);
    }

}