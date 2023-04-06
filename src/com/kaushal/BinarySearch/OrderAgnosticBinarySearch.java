package com.kaushal.BinarySearch;


public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[] numsAns = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int target = 10;
        int ans1 = binarySearchAlgo(nums, target);
        int ans = binarySearchAlgo(numsAns, target);
        if (ans < 0) {
            System.out.println(" Target Not Found");
        } else {
            System.out.println("Ans is in Index : " + ans);
        }
    }

    private static int binarySearchAlgo(int[] arr, int target) {
        if (arr.length == 0 || arr == null) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        boolean is_ascending = arr[right] > arr[left];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (is_ascending) {
                if (target > arr[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;

    }
}
