package com.javatest;

class Base2 {
    public void baseMethod(){
        System.out.println("BaseMethod called...");
    }
}

class Derived2 extends Base2{
    public void baseMethod(){
        System.out.println("DerivedMethod called...");
    }
}
public class OverrideExample2{
    public static void main(String[] args) {
        Base2 b = new Derived2();
        b.baseMethod();
    }
}