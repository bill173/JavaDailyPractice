package com.javatest.Array;

/**
 * Java Program to illustrate how to declare, instantiate, initialize
 * and traverse the Java array.
 */
public class ArrayExample1 {
    public static void main(String[] args) {
        int a[] = new int[3];//declaration and instantiation, 3 is the length of this array
        a[0] = 6;//initialization
        a[1] = 9;
        a[2] = 15;
        //another way of declaration, instantiation and initialization
        //int a[]={33,3,4,5};//declaration, instantiation and initialization
        //traversing array

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

        //use for each loop to traverse array
        for (int i:a) {
            System.out.println(i);
        }
    }
}
