package com.kaushal.SortingAlgorithms;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {12,32, 1999,2,9,79,8,5,3,9,79,99,0};
        selectionSort(arr);
        System.out.println(" After Sorting : " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        //This code finds the minimum element in the array and swaps with the first unsorted Index.
        int point = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int swap = point;
            for (int j = point ; j <= arr.length - 1; j++){
                if (arr[j] < min){
                    min = arr[j];
                    swap = j;
                }
            }
            int temp = arr[point];
            arr[point] = min;
            arr[swap] = temp;
            point++;
        }
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
