package com.kaushal.BinarySearch;

import java.util.Arrays;


public class FindLeftOccuranceAndRight {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 8, 10};
//        int[] arrDesc = {100,90,80,80,80,70,60,50,40,30,20,10};
        boolean is_ascending = findIsAscending(arr);
        int target = 8;
      int[] ans = {-1, -1};
        int leftBoundary = findLeftIndex(arr, target, is_ascending);
        int rightBoundary = findRightIndex(arr, target, is_ascending);
            ans[0] = leftBoundary;
            ans[1] = rightBoundary;
        System.out.println("Ans == " + Arrays.toString(ans));

    }
    private static int findRightIndex(int[] arr, int target, boolean order) {
        if (order){
            if (arr[0] > target ||target > arr[arr.length - 1] || arr == null){
                return -1;
            }
        }else {
            if (target > arr[0] ||target < arr[arr.length - 1] || arr == null){
                return -1;
            }
        }
        int rightIdx = -1;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right){
            if (order){
                mid = left + (right - left)/2;
                if (arr[mid] == target){
                    rightIdx = mid;
                    left = mid + 1;
                }
                else if (arr[mid] < target) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }else {
                mid = left + (right - left)/2;
                if (arr[mid] == target){
                    rightIdx = mid;
                    left = mid + 1;
                }
                else if (arr[mid] < target) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
        }
        return  rightIdx ;
    }


    private static int findLeftIndex ( int[] arr, int target , boolean order){
        if (order){
            if (target < arr[0] ||target > arr[arr.length - 1] || arr == null){
                return -1;
            }
        }else {
            if (target > arr[0] ||target < arr[arr.length - 1] || arr == null){
                return -1;
            }
        }
        int leftIdx = -1;
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right){
            if (order){
                mid = left + (right - left)/2;
                if (arr[mid] == target){
                    leftIdx = mid;
                    right = mid - 1;
                }
                else if (arr[mid] < target) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }else {
                mid = left + (right - left)/2;
                if (arr[mid] == target){
                    leftIdx = mid;
                    right = mid - 1;
                }
                else if (arr[mid] < target) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
        }
        return  leftIdx ;
    }
    private static boolean findIsAscending ( int[] arr){
        return arr[0] < arr[arr.length - 1];
    }
}