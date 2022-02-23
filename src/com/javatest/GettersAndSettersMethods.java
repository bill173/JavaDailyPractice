package com.javatest;

public class GettersAndSettersMethods {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
 class Student {
     private int roll;
     private String name;

     //getter(accessor) is used to get the value of the private field
     public int getRoll(){
         return roll;
     }
     //setter(mutator) is used to set the value of the private field
     public void setRoll(int roll){
         this.roll = roll;
     }

     public String getName(){
         return name;
     }
     public void setName(String name){
         this.name = name;
     }
     public void display(){
         System.out.println("Roll no. is: " + roll);
         System.out.println("Student name is: " + name);
     }
 }