package com.kaushal.Arrays;

import java.util.Arrays;

public class PassByReference {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //Removing last element from Array.
        int poppedVal = arr[arr.length - 1];
        System.out.println("Popped value " + poppedVal);
        int[] deepCopiedArray = Arrays.copyOf(arr,arr.length - 1);
        System.out.println(Arrays.toString(deepCopiedArray));
        //Inserting in Array. Since Array are of fixed Size in Java We need to deepCopy array and Assign value to last index.
        String[] names = {"KD","MD","JD","PD"};
        String[] copiesNames = Arrays.copyOf(names,names.length + 1);
        System.out.println("Before Pushing " + Arrays.toString(copiesNames));
        copiesNames[copiesNames.length - 1 ] = "Hy I'm Inserted";
        System.out.println("Pushing mechanism in Array " + Arrays.toString(copiesNames));

        //Pass By reference Example 1
        int[] ages = {1,2,3,4,5};
        int[] newAges = ages;
        newAges[0] = 100;
        System.out.println("New Ages "+ Arrays.toString(newAges));
        //Here Original Array is Also modified
        System.out.println("Original Ages " + Arrays.toString(ages));

        //Pass By reference Example 2
        int[] nextAges = {1,2,3,4,5,6,7,8};
        //Before Passing to Function
        System.out.println("Before Passing To Function " + Arrays.toString(nextAges));
        changeArray(nextAges);
        //After calling Function
        //Original nextAges changes as non-Primitive data types are passed by reference and stored in heap memory.
        System.out.println("After Passing to Function " + Arrays.toString(nextAges));

        //Pass By reference Example 2(Strings)
        String company = "Samsung";
        String newCompany = company;
        System.out.println("Company Name " + company);
        System.out.println("New Company Name " + newCompany);
//        System.out.println(company.charAt(0));
        // Looping through String
        for (int i = 0; i < company.length(); i++) {
            char c = company.charAt(i);
            System.out.println(c);
        }
        // Looping through String
        System.out.println("Char array = " + Arrays.toString(company.toCharArray()));
        char[] charArray = company.toCharArray();
        charArray[0] = 'Z';
        System.out.println("Char Array:::" + Arrays.toString(charArray));
        System.out.println("Company Array ::" + Arrays.toString(company.toCharArray()));


    }
    static void changeArray(int[] arr){
        arr[0] = 999;
    }
}
