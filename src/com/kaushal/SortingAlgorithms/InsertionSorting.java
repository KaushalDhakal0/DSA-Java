package com.kaushal.SortingAlgorithms;

import java.util.Arrays;

public class InsertionSorting {
    public static void main(String[] args) {
        int [] unsortedArray = {12,4,3,65,76,6};
        insertionSort(unsortedArray);
        System.out.println("Sorted Array : (Insertion Sorting) ==>" + Arrays.toString(unsortedArray));

    }
    private static void insertionSort(int[] unsortedArray) {
        int n = unsortedArray.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j > 0; j --) {
                if (unsortedArray[j] < unsortedArray[j - 1]){
                    swap(unsortedArray,j);
                }else {
                    break;
                }

            }
        }
    }
    private static void swap(int[] unsortedArray, int j) {
        int temp = unsortedArray[j - 1];
        unsortedArray[j - 1] = unsortedArray[j];
        unsortedArray[j] = temp;
    }
}
