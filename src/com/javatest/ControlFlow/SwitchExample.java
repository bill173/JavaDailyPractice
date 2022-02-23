package com.javatest.ControlFlow;

public class SwitchExample implements Cloneable {
    public static void main(String[] args) {
        int num = 2;
        switch (num){
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            case 3:
                System.out.println("number is 3");
            default:
                System.out.println(num);
        }
    }
}
