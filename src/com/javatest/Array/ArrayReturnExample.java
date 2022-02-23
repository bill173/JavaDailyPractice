package com.javatest.Array;

public class ArrayReturnExample {
    public static void main(String[] args) {
        //calling method????? why is this
        int arr[] = get();
        //printing the values of an array
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    //this method returns an array
    static int[] get(){
        return new int[]{10,30,50,90,60};
    }
}
