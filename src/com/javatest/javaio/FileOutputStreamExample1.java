package com.javatest.javaio;

import java.io.FileOutputStream;

public class FileOutputStreamExample1 {//write byte
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("D:\\testout.txt");
            f.write(65);
            f.close();
            System.out.println("success...");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
