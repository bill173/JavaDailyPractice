package com.javatest.exceptionhandling;

import java.io.IOException;

public class ExceptionPropagationExample2 {
    public static void main(String args[]){
        ExceptionPropagationExample2 obj=new ExceptionPropagationExample2();
        obj.p();
        System.out.println("normal flow");
    }

    //add throws
    void m() throws IOException {
        throw new java.io.IOException("device error");//checked exception
    }
    void n() throws IOException {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
}
/**
 * There are two cases:
 *
 * Case 1: We have caught the exception i.e. we have handled the exception using try/catch block.
 * Case 2: We have declared the exception i.e. specified throws keyword with the method.
 */