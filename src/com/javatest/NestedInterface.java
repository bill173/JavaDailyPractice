package com.javatest;

public class NestedInterface {
    public static void main(String[] args) {
        Showable3.Message s = new TestNestedInterface3();//upcasting here
        s.msg();
    }
}
interface Showable3{
    void show();
    interface Message{
        void msg();
    }
}
class TestNestedInterface3 implements Showable3.Message{
    public void msg(){
        System.out.println("hello nested interface");
    }
}