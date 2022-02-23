package com.javatest.ControlFlow;

public class IfExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        if(x + y < 10){
            System.out.println("x + y is less than 10");
        }
        else if (x + y > 30){
            System.out.println("x + y is greater than 30");
        }
        else {
            System.out.println("x + y is greater than 20");
        }
    }
}
