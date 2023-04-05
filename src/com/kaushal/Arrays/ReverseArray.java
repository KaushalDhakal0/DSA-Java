package com.kaushal.Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,6};
         System.out.println("Before Reversing : " + Arrays.toString(arr));
        // swap(arr,0,arr.length - 1);
        reverse(arr);
         System.out.println("After Reversing : " + Arrays.toString(arr));
    }
    static void swap (int[] arr, int i , int j){
        int temp =  arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static int reverse(int[] arr){
        if (arr.length == 0) {
            return -1;
        }
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
        return 1;
    }
}
