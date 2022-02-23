package com.javatest;

//calls abstract and non-abstract methods
public class AbstractClassExample2 {
    public static void main(String[] args) {
        Bike3 obj = new Honda3();
        obj.run();
        obj.changeFear();
    }
}
//an abstract class that has constructor, abstract method, and non-abstract method
abstract class Bike3{
    Bike3(){
        System.out.println("bike3 is created");
    }
    abstract void run();
    void changeFear(){
        System.out.println("gear changed");
    }
}
//a Child class which inherits Abstract class
class Honda3 extends Bike3{

    @Override
    void run() {
        System.out.println("running safely..");
    }
}