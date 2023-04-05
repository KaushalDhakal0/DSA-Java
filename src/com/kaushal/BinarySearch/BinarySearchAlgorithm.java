package com.kaushal.BinarySearch;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int target = 4;
        int ans = binarySearchAlgo(nums , target);
        if (ans < 0) {
            System.out.println(" Target Not Found");
        }else {
            System.out.println("Ans is in Index : " + ans);
        }
    }

    private static int binarySearchAlgo(int[] numbs, int target) {
        if (numbs.length < 1){
            return -1;
        }
        int left = 0;
        int right = numbs.length - 1;
        while (left < right){
            int mid = (left + right)/2;
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
