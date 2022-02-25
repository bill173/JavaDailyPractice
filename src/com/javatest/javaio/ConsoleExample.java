package com.javatest.javaio;

import java.io.Console;

class ConsoleExample {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter you name: ");
        String n = c.readLine();
        System.out.println("Welcome " + n);
    }
}
