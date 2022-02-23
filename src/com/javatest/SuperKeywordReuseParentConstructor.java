package com.javatest;

public class SuperKeywordReuseParentConstructor {
    public static void main(String[] args) {
        Emp2 e1 = new Emp2(1, "ankit", 45000f);
        e1.display();
    }
}
class Person{
    int id;
    String name;
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Emp2 extends Person{
    float salary;
    Emp2(int id, String name, float salary) {
        super(id, name);//reusing parent constructor
        this.salary = salary;
    }
    void display(){
        System.out.println(id + " " + name + " " + salary);
    }
}