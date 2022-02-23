package com.javatest;

public class StaticMethodInInterface {
    public static void main(String[] args) {
        Drawable3 d = new Rectangle3();
        d.draw();
        System.out.println(Drawable3.cube(4));
    }
}
interface Drawable3{
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}
class Rectangle3 implements Drawable3{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
