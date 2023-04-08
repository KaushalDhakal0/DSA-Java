package com.kaushal.BinarySearch;

import static java.lang.Math.*;

//1095. Find in Mountain Array\
//Given a mountain array mountainArr,
//return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
public class FindInMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,100,5,4,3,2,1};
        int target = 100;
        int ans = findPeakValIndex(arr, target);
        int leftBoundary = binarySearch(arr, target, 0 , ans);
        if (leftBoundary != -1){
            System.out.println("Ans = : "+ leftBoundary);
        }

        int rightBoundary = binarySearch(arr,target,ans+1, arr.length - 1);
        System.out.println("Ans :: Right Boundary =" + rightBoundary);

    }

    private static int findPeakValIndex(int[] arr, int target) {
        if (arr.length < 3){
            return -1;
        }
        int start = 0 ;
        int end = arr.length - 1;
        int mid ;
        while (start < end){
            mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                //Descending Chunk
                end = mid;
            }else {
                start = mid + 1;
            }
        }

        return start;
    }
    private static int binarySearch(int[] arr, int target, int start, int end){
        int mid;
        boolean is_ascending = arr[start] < arr[end];
        while (start <= end){
            mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (is_ascending){
                 if (arr[mid] > target) {
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }else {
                 if (arr[mid] < target) {
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
