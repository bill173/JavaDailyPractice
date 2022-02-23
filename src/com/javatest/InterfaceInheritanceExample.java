package com.javatest;
// a class implements ana interface, but one interface extends another interface
public class InterfaceInheritanceExample {
    public static void main(String[] args) {
        TestInterface t = new TestInterface();
        t.print();
        t.show();
    }
}

interface Printable2{
    void print();
}
interface Showable2 extends Printable2{
    void show();
}
class TestInterface implements Showable2{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
}