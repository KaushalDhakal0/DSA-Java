package com.kaushal.AccessControl;


import java.util.ArrayList;

public class AccessControl {

    //The member is accessible from any class.
    public int age;

    //The member is accessible within the same class, subclasses, and classes in the same package.
    protected String name;

    //The member is only accessible within the same class.Nested class can access it.
    private int[] arr;

    public AccessControl(int age, String name, int[] arr) {
        this.age = age;
        this.name = name;
        this.arr = arr;
    }

    public void setAge(int num){
        this.age = num;
    }
}
