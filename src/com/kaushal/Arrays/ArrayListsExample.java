package com.kaushal.Arrays;

import java.util.ArrayList;

public class ArrayListsExample {
    public static void main(String[] args) {
        //    Integer Array List
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(23);
        intList.add(33);
        intList.add(43);
        intList.add(53);
        System.out.println("ArrayList = " + intList);
        intList.remove(0);
        System.out.println("After Removing ArrayList = " + intList);

        //    String Array List
        ArrayList<String> arrStringList =  new ArrayList<String>();
        arrStringList.add("Apple");
        arrStringList.add("Mango");
        arrStringList.add("Banana");
        arrStringList.add("Kiwi");
        arrStringList.add("Potato");
        System.out.println("String Array List + " + arrStringList);
        // removing by directly giving value.Works for only string Lists(does not works for integer Lists
        arrStringList.remove("Apple");
        //Removing by index
        arrStringList.remove(3);
        System.out.println("After removing string array list + " + arrStringList);
        // get value by index value.
        System.out.println(arrStringList.get(2));
        System.out.println("Length = " + arrStringList.size());
    }
}
