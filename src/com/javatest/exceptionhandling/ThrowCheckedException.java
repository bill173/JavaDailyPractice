package com.javatest.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedException {
    public static void main(String[] args) {
        try {
            method();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("rest of the code");
    }

    public static void method() throws FileNotFoundException{
        FileReader file = new FileReader("C:\\Users\\Bill\\Desktop\\abc.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw new FileNotFoundException();
    }
}
