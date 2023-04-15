package com.kaushal.BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] value = { 6,7,8,9, 1, 2, 3, 4};
        int target = 1;
        int ans;
        int peakIndex = findRotationPoint(value);
        if (target > value[0]){
             ans = binarySearchAlgo(value, 0, peakIndex - 1, target );
        }else {
            ans = binarySearchAlgo(value, peakIndex, value.length - 1, target );
        }
         System.out.println("Running===>" + ans);
    }
    private static int findRotationPoint(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end){
            mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]){
                return mid + 1;
            } else if (arr[start] > arr[mid]) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        //If we reached here then array is not rotated and we simply return first value of that array.
        return arr[0];
    }
    private static int binarySearchAlgo(int[] numbs,int left, int right ,  int target) {
        if (numbs.length < 1){
            return -1;
        }
        while (left <= right){
            int mid = left + (right - left)/2;
            if (numbs[mid] == target){
                return mid;
            }
            if (target > numbs[mid]){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
