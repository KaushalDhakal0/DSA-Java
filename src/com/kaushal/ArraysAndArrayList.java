package com.kaushal;

import java.util.Arrays;

public class ArraysAndArrayList {
    public static void main(String[] args) {
         int[] array = {123,78,54,67,0,1,2,3,4,5,6,7,8,900};
//         System.out.println("Input Array ==>" + Arrays.toString(array));
//        System.out.println("Length =>" + array.length);
//        //Arrays.sort(arr) modifies the original array;
////        Arrays.sort(array);
//        newSort(array);
//        System.out.println("Sorting Array " +  Arrays.toString(array));
//        //Searching in array
//        int index = Arrays.binarySearch(array, 7);
//        System.out.println("Binary search ==" + index + "Value ===" + array[index]);

        //Find Largest
        finLargestInArray(array);
        System.out.println("Largest Element in the array = " + array[array.length - 1]);
        System.out.println("Largest Element in the array  second approach= " + findLargest(array));
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
