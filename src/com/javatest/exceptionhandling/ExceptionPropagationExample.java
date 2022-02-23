package com.javatest.exceptionhandling;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        ExceptionPropagationExample obj = new ExceptionPropagationExample();
        obj.p();
        System.out.println("normal flow..");
    }

    void m(){
        int data = 50 / 0;
    }
    void n(){
        m();
    }
    void p(){
        try {
            n();
        }catch (Exception e){
            System.out.println("Exception handled");
        }
    }
}
/**
 * In the above example exception occurs in the m() method where it is not handled,
 * so it is propagated to the previous n() method where it is not handled,
 * again it is propagated to the p() method where exception is handled.
 */
