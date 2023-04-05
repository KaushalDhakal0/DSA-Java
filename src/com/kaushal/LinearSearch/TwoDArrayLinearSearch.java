package com.kaushal.LinearSearch;

public class TwoDArrayLinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        String[][] strArray = {
                {"abc", "def", "ghi"},
                {"jkl", "mno" , "pqr"},
                {"stw", "xyz", "poy"}
        } ;
        int target = 78;
        String targetStr = "mno";
        System.out.println("String Ans = " + checkIfExists(strArray,targetStr));
        System.out.println("Ans = " + checkIfExists(arr, target));
    }
    static boolean checkIfExists(int[][] data , int val){
        if (data.length == 0){
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == val){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean checkIfExists(String[][] data , String val){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j].equals(val)){
                    return true;
                }
            }
        }
        return false;
    }
}
