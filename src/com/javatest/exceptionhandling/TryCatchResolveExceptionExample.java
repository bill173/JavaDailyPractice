package com.javatest.exceptionhandling;

public class TryCatchResolveExceptionExample {
    public static void main(String[] args) {
        int i = 50;
        int j = 0;
        int data;
        try {
            data = i/j;//here may thrwo exception
        }catch (Exception e){
            //resolving the exception in the catch block
            System.out.println(i/(j+2));
        }
    }
}
