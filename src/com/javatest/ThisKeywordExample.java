package com.javatest;

public class ThisKeywordExample {
    public static void main(String[] args) {
        Student4 s1=new Student4(111,"ankit",5000f);
        Student6 s2=new Student6(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
class Student4{
    int rollno;
    String name;
    float fee;
    Student4(int rollno, String name, float fee){
        //this keyword is used to distinguish local variable and instance variable.
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}
class Student6{
    int rollno;
    String name;
    float fee;
    Student6(int r, String n, float f){
        /**
         * if local variables(formal arguments) and instance variables are different,
         * there is no need to use this keyword.
         */
        rollno=r;
        name=n;
        fee=f;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }
}