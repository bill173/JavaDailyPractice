package com.javatest;

public class InstanceInitializerBlock {

    public static void main(String[] args) {
        B3 b = new B3();
    }
}
class A3{
    A3(){
        System.out.println("parent class constructor invoked");
    }

}
class B3 extends A3{
    B3(){
        super();
        System.out.println("child class constructor invoked");
    }
    {System.out.println("instance initializer block is invoked");}
    //The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
}

