package com.javatest;

abstract class AbstractMethod {
    abstract void display();
}
public class AbstractMethodExample extends AbstractMethod
{
    //method implementation, Override is optional but recommend. It helps to verify the method is from superclass
    @Override
    void display()
    {
        System.out.println("Abstract method?");
    }
    public static void main(String args[])
    {
        //creating object of abstract class
        AbstractMethod obj = new AbstractMethodExample();
        //invoking abstract method
        obj.display();
    }

}
