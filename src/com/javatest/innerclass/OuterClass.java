package com.javatest.innerclass;

public class OuterClass {
    private int num = 30;
    class InnerClass {
        void msg(){
            System.out.println("The number is " + num);
        }
    }

    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        //instantiate Member Inner class in Java
        InnerClass in = obj.new InnerClass();
        //inner class access the private data member of the outer class
        in.msg();

    }
}
