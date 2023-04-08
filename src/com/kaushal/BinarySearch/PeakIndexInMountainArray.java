package com.kaushal.BinarySearch;
// Question: https://leetcode.com/problems/peak-index-in-a-mountain-array/
//Answer is in O(log(n))
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] values = {0,10,20,1005,2};
        int answer = findPeakIndex(values);
        System.out.println("Answer :: " + answer);
    }

    private  static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
                if (arr[mid] > arr[mid + 1]){
                    //This implies we are in the descending part of array
                    end = mid;
                }else {
                    // We are in ascending part.
                    start = mid + 1;
                }
        }
        return start;
    }
}
