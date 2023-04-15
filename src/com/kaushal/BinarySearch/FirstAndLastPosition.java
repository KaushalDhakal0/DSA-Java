package com.kaushal.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] result = getAns(arr,target);
        System.out.println("Hello");
        System.out.println("Answer == " + Arrays.toString(result));
    }
    private static int[] getAns(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] ans = {-1,-1};
        while (left <= right){
            int mid = left  + (right-left)/2;
            if (target > nums[mid]){
                left = mid + 1 ;
            } else if (target < nums[mid]) {
                right = mid - 1;
            }else {
                ans[0] = mid;
                right = mid -1;
            }
        }

         left = 0;
         right = nums.length - 1;
        while (left <= right){
            int mid = left  + (right-left)/2;
            if (target > nums[mid]){
                left = mid + 1 ;
            } else if (target < nums[mid]) {
                right = mid - 1;
            }else {
                ans[1] = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
}
