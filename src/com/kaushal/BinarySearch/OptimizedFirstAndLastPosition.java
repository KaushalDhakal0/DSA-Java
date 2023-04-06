package com.kaushal.BinarySearch;

import java.util.Arrays;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.
public class OptimizedFirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 104;
        int[] ans = {-1, -1};
        int leftBoundary = findLeftBoundary(arr, target);
        int rightBoundary = findRightBoundary(arr, target);
        ans[0] = leftBoundary;
        ans[1] = rightBoundary;
        System.out.println("Ans == " + Arrays.toString(ans));
    }

    private static int findRightBoundary(int[] arr, int target) {
        int rightBoundary = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                rightBoundary = mid;
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return rightBoundary;

    }

    private static int findLeftBoundary(int[] arr, int target) {
        int leftBoundary = -1;
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                leftBoundary = mid;
                right = mid - 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return leftBoundary;
    }
}
