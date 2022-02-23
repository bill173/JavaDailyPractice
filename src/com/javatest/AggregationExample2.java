package com.javatest;

public class AggregationExample2 {
    public static void main(String[] args) {
        Address address1=new Address("beijing","changping","china");
        Address address2=new Address("shanghai","pudong","china");
        Emp e=new Emp(111,"jack",address1);//use address object as argument
        Emp e2=new Emp(112,"elaine",address2);
        e.display();
        e2.display();
    }
}

class Address{
    String city, state, country;

    Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class Emp{
    int id;
    String name;
    Address address;//Aggregation usage over here

    Emp(int id, String name,Address address){
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id + " " + name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
}