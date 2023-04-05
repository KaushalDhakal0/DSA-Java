package com.kaushal.LinearSearch;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;

        boolean exist = checkIfExist(arr, target);
        System.out.println(" Value : " + target  + " == " + exist);

        String[] names = {"Sujal", "Aryan", "Paru", "Bishal"};
        String check = "Aryan";
        String check2 = "test";
        boolean ans = checkIfExistStr(names, check);
        boolean ans2 = checkIfExistStr(names, check2);
        System.out.println("String Ans Exist One " + ans);
        System.out.println("String Ans Exist Two " + ans2);


    }
    static boolean checkIfExist(int[] arr, int idx){
        for (int dta:arr
             ) {
            if(idx == dta){
                return true;
            }
        }
        return false;
    }
    static boolean checkIfExistStr(String[] arr , String target){
        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == target){
//            System.out.println("XXXX====>");
//          }
            if (arr[i].equals(target)){
                return true;
            }
        }
        return false;
    }
}
