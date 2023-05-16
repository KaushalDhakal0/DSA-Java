package com.kaushal.SortingAlgorithms;

import java.util.Arrays;

// In order to apply Cyclic Sort One array must contain values from [1......to N]
public class CycleSorting {
    public static void main(String[] args) {
        int [] unsortedArray = {1,3,5,2,4};
        cycleSort(unsortedArray);
        System.out.println("Sorted Array : (Cycle Sort) ==>" + Arrays.toString(unsortedArray));
    }
    private static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length ){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
