package com.kaushal.SortingAlgorithms;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {12,32, 1,2,8,5,3,9,7};
        bubbleSort(arr);
        System.out.println(" After Sorting : " + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
