package com.javatest;


public class ProveThisKeywordExample {
    public static void main(String[] args) {
        A2 obj = new A2();
        System.out.println(obj);
        //Let's prove that this keyword refers to the current class instance variable.
        obj.m();
    }
}
class A2{
    void m(){
        System.out.println(this);//prints same reference ID
    }
}
