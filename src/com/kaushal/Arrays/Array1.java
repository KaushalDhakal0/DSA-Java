package com.kaushal.Arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        //Primitive Data Types are Passed By Values but Non Primitive Data Types are passed by Reference.
        int[] listArr = {1,2,3,4,5,6,7};
        //RunTime Array
        int[] runtimeArray = new int[10];
        Arrays.fill(runtimeArray, 98);
        String[] strArray =  new String[10];
        Arrays.fill(strArray, "KD");
        //Printing Arrays
        System.out.println("String Array =" + Arrays.toString(strArray));
        System.out.println("ARRay ==" + Arrays.toString(runtimeArray));

        //Using Loops
        for (int i = 0; i < listArr.length; i++) {
            System.out.println(listArr[i]);
        }
    }
}
