package com.javatest.string;

public class StringMethod {
    public static void main(String[] args) {
        String name="javatpoint";
        char ch=name.charAt(4);//returns the char value at the 4th index
        //char ch2=name.charAt(10);//returns the char value at the 10th index
        System.out.println(ch);
        System.out.println("---");
        String str = "Welcome";
        int strLength = str.length();
        // Fetching first character
        System.out.println("Character at 0 index is: "+ str.charAt(0));
        // The last Character is present at the string length-1 index
        System.out.println("Character at last index is: "+ str.charAt(strLength-1));

        System.out.println("---");
        String s="what do you know about me";
        System.out.println(s.contains("do you know"));//true
        System.out.println(s.contains("about"));//true
        System.out.println(s.contains("hello"));//false
    }
}
