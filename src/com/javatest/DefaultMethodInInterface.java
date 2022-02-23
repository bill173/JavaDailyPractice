package com.javatest;

public class DefaultMethodInInterface {
    public static void main(String[] args) {
        Drawable2 d = new Rectangle2();
        d.draw();
        d.msg();
    }
}
interface Drawable2{
    void draw();
    default void msg(){
        System.out.println("default method in interface");
    }
}
class Rectangle2 implements Drawable2{

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}