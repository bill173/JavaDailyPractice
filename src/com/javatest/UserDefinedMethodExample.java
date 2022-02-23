package com.javatest;
import java.util.Scanner;

public class UserDefinedMethodExample {
    static void findEvenOdd(int num){
        //method body
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        findEvenOdd(n);
    }
}
