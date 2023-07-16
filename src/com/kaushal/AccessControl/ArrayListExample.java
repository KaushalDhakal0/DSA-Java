package com.kaushal.AccessControl;

import java.util.ArrayList;

public class ArrayListExample {
    private String name;
    private int age;

    public ArrayListExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create an ArrayList of Person objects
        ArrayList<ArrayListExample> people = new ArrayList<>();

        // Add Person objects to the ArrayList
        people.add(new ArrayListExample("John", 25));
        people.add(new ArrayListExample("Jane", 30));
        people.add(new ArrayListExample("Mike", 35));

        // Iterate over the ArrayList and access object properties
        for (ArrayListExample person : people) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
