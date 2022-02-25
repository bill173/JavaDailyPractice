package com.javatest.javaio;

import java.io.FileOutputStream;

public class FileOutputStreamExample2 {//write string
    public static void main(String[] args) {
        try{
            FileOutputStream f = new FileOutputStream("D:\\testout.txt");
            String s = "Welcome to java learning  world!!";
            byte b[] = s.getBytes();//converting string into byte array, before you can use write()
            f.write(b);
            f.close();
            System.out.println("success...");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
