package com.javatest;

/**
 * The abstract class can also be used to provide some implementations of
 * the interface. In such case, the end user may not be forced to override
 * all the methods of the interface.
 */
public class AbstractClassExample3 {
    public static void main(String[] args) {
        A4 a = new M4();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}

interface A4{
    void a();
    void b();
    void c();
    void d();
}

abstract class B4 implements A4{
    public void c(){
        System.out.println("I am c");
    }
}

class M4 extends B4{
    public void a() {
        System.out.println("I am a");
    }
    public void b() {
        System.out.println("I am b");
    }
    public void d() {
        System.out.println("I am d");
    }
}