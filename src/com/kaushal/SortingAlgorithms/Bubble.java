package com.kaushal.SortingAlgorithms;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
//        int[] arr = {12,32, 1,2,9,79,8,5,3,9,79};
        int[] arr = {1,2,3,4,5,6,7,8};
        bubbleSort(arr);
        System.out.println(" After Sorting : " + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        boolean isAlreadySorted = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isAlreadySorted = false;
                }
            }
            //If Already Sorted it goes through only one loop and breaks. If this check is not performed then outer loop will run for n-1 times.i.e redundant iteration
            if (isAlreadySorted){
                break;
            }
        }
    }
}
