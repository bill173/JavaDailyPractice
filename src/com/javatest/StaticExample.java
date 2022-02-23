package com.javatest;

public class StaticExample {
    public static void main(String[] args) {
        //Calculate.cube(3);
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();

    }
}
class Calculate{
    static int cube(int x){
        System.out.println(x*x*x);
        return x*x*x;
    }
}
class Counter{
    //if comment out static here, the result would be different
    static int count = 0;
    Counter(){
        count++;
        System.out.println(count);
    }
}