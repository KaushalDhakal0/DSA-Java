package com.kaushal.Arrays;

import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //For Integer Values
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter value for 2D Array");
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
//                System.out.println("index = (i,j) = (" + i + "," + j + ") Value = " + arr[i][j] );
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //arr[i][j] = in.nextInt();
                System.out.println("index = (i,j) = (" + i + "," + j + ") Value = " + arr[i][j] );
            }
        }
        //For String Values
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Please enter value for 2D Array<Strings>");
        String[][] arrStr = new String[3][3];
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                arrStr[i][j] = in.next();
//                System.out.println("index = (i,j) = (" + i + "," + j + ") Value = " + arr[i][j] );
            }
        }
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                //arr[i][j] = in.nextInt();
                System.out.println("index = (i,j) = (" + i + "," + j + ") Value = " + arrStr[i][j] );
            }
        }
    }
}
