package com.javatest;
//super is used to invoke parent class constructor.
public class SuperKeywordExample3 {
    public static void main(String[] args) {
        Dog5 d = new Dog5();
    }
}
class Animal5{
    Animal5(){
        System.out.println("animal5 is created");
    }
}
class Dog5 extends Animal5{
    Dog5(){
        //super();
        //super() added in each class constructor automatically by compiler if there is no super() or this().
        System.out.println("Dog5 is created");
    }
}