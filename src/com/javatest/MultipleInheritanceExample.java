package com.javatest;

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}
interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable, Showable{

    @Override
    public void print() {
        System.out.println("Hello print");
    }

    @Override
    public void show() {
        System.out.println("Hello show");
    }
}