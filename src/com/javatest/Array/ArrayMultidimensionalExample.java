package com.javatest.Array;

public class ArrayMultidimensionalExample {
    public static void main(String[] args) {
        //declaring and initializing 2D array
        int arr[][] = {{1,2,3}, {2,4,5}, {4,5,7}};
        System.out.println("Printing original array:");
        //printing 2D array using nested for loop
        for (int i = 0;i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int carr[][] = arr.clone();
        System.out.println("Printing clone of the array:");
        for (int i = 0;i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(carr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Are both equal?");
        System.out.println(arr==carr);
    }
}
