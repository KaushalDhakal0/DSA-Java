package com.kaushal.BinarySearch;

import java.util.Arrays;


public class FindLeftOccuranceAndRight {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 8, 10};
        int target = 10;
        int[] ans = {-1, -1};
        int leftBoundary = findLeftIndex(arr, target);
        int rightBoundary = findRightIndex(arr, target);
            ans[0] = leftBoundary;
            ans[1] = rightBoundary;
        System.out.println("Ans == " + Arrays.toString(ans));

    }

    private static int findRightIndex(int[] arr, int target) {
        if (target < arr[0] || target > arr[arr.length - 1] || arr == null){
            return -1;
        }
        int rightIdx = -1;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right){
            mid = left + (right - left)/2;
            if (arr[mid] == target){
                rightIdx = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return  rightIdx ;
    }


    private static int findLeftIndex ( int[] arr, int target){
        if (target < arr[0] || target > arr[arr.length - 1] || arr == null){
            return -1;
        }
        int leftIdx = -1;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right){
            mid = left + (right - left)/2;
            if (arr[mid] == target){
                leftIdx = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return  leftIdx ;
    }
}