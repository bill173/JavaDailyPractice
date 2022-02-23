package com.javatest;

public class UserDefinedMethodExample2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = add(a,b);
        System.out.println("The sum of a and b is " + c);
    }
    public static int add(int num1, int num2){
        int s = num1 + num2;
        return s;
    }
}
