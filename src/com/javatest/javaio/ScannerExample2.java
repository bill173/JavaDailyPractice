package com.javatest.javaio;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        String s = "Hello, this is JavaTpoint.";
        //create scanner Object and pass string in it
        Scanner scan = new Scanner(s);
        //Check if the scanner has a token
        System.out.println("Boolean Result: " + scan.hasNext());
        //print the string
        System.out.println("String: " + scan.nextLine());
        scan.close();
        System.out.println("-----Enter your Detail-----");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Name: " + name);
        System.out.print("Enter your age: ");
        int i = in.nextInt();
        System.out.println("Age: " + i);
        System.out.print("Enter your salary: ");
        double d = in.nextDouble();
        System.out.println("Salary: " + d);
        in.close();
    }
}
/**
 * How to get Java Scanner:
 * 1. To get the instance of Java Scanner which reads input from the user, we need to pass the input stream (System.in) in the constructor of Scanner class. For Example:
 * Scanner in = new Scanner(System.in);
 *
 * 2. To get the instance of Java Scanner which parses the strings, we need to pass the strings in the constructor of Scanner class. For Example:
 * Scanner in = new Scanner("Hello Javatpoint");
 */