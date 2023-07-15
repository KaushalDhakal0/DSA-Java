package com.kaushal.StaticExample;

public class Human {
    static  String name;
    String maritalStatus;
    int age;
    int salary;
    public Human( String name,int age,int salary,String maritalStatus){
        Human.name = name;
        this.age = age;
        this.salary = salary;
        this.maritalStatus = maritalStatus;
    }
}
