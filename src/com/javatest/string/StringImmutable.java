package com.javatest.string;

/**
 * In Java, String objects are immutable. Immutable simply means unmodifiable or unchangeable.
 * Once String object is created its data or state can't be changed but a new String object is created.
 * Let's try to understand the concept of immutability by the example given below:
 */
public class StringImmutable {
    public static void main(String[] args) {
        String s = "Bill";
        s.concat(" Liu");//concat() method appends the string at the end
        System.out.println(s);//will print Bill because strings are immutable objects
        s = s.concat(" Liu");
        System.out.println(s);
    }
}
