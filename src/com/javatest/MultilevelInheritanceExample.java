package com.javatest;

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        BabyDog2 d = new BabyDog2();
        d.weep();
        d.bark();
        d.eat();
    }
}

class Animal2{
    void eat(){System.out.println("eating...");}
}
class Dog2 extends Animal2{
    void bark(){System.out.println("barking...");}
}
class BabyDog2 extends Dog2{
    void weep(){System.out.println("weeping...");}
}