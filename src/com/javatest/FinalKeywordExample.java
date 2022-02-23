package com.javatest;
//we initialize blank final variable only in constructor
public class FinalKeywordExample {
    public static void main(String[] args) {
        Bike2 b = new Bike2();
    }
}
class Bike2{
    final int speedlimit;

    Bike2() {
        this.speedlimit = 80;
        System.out.println(speedlimit);
    }
}