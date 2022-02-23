package com.javatest.exceptionhandling;

/**
 * Some of the rules are listed below:
 *
 * If the superclass method does not declare an exception
 * If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
 * If the superclass method declares an exception
 * If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
 */

//in this example, class ArithmeticException is a child(sub) class of class Exception
class Parent{
    void msg()throws Exception {
        System.out.println("parent method");
    }
}

class ExceptionWithMethodOverriding extends Parent{
    void msg()throws ArithmeticException {
        System.out.println("child method");
    }

    public static void main(String args[]){
        Parent p = new ExceptionWithMethodOverriding();

        try {
            p.msg();
        }
        catch(Exception e) {}
    }
}
