package com.kaushal.RandomQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysAndArrayList {
    public static void main(String[] args) {
//         int[] array = {123,78,54,67,0,1,2,3,4,5,6,7,8,900};
//         System.out.println("Input Array ==>" + Arrays.toString(array));
//        System.out.println("Length =>" + array.length);
//        //Arrays.sort(arr) modifies the original array;
//        Arrays.sort(array);
//        newSort(array);
//        System.out.println("Sorting Array " +  Arrays.toString(array));
//        //Searching in array. To use binary search array must be sorted.
//        int index = Arrays.binarySearch(array, 987);
//        System.out.println("Binary search ==::" + index );
        int[] array = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(array);
    }
    static int[] newSort(int[] val){
        // If you don't clone the array Original array will be modified.
        int [] cloned = val.clone();
         Arrays.sort(cloned);
       return cloned;
    }
    static void finLargestInArray(int[] vals){
        Arrays.sort(vals);
    }
    static  int findLargest(int[] nums){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
        }
        return max;
    }
}
