package com.javatest;

public class AbstractClassAndInterfaceExample {
    public static void main(String[] args) {
        A0 a = new M0();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
//create an interface that have 4 methods
interface A0{
    void a();//by default, public and abstract
    void b();
    void c();
    void d();
}
//create abstract class that provides the implementation of one method of A interface
abstract class B0 implements A0{
    public void a(){System.out.println("I am a");}
}
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M0 extends B0{
    public void b(){System.out.println("I am b");}
    public void c(){System.out.println("I am c");}
    public void d(){System.out.println("I am d");}
}