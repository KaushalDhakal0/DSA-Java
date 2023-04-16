package com.kaushal.BinarySearch;

public class RotatedWithDuplicates {
    public static void main(String[] args) {
        int[] value = {  1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1 };
//        int [] value = {4,5,6,7,1,2,3};
        int target = 13;
        int ans;
        int peakIndex = findRotationPoint(value);
        System.out.println("PEAK INDEX =====>>>>>> " + peakIndex);
        if (target >= value[0] && target <= value[peakIndex - 1]) {
            ans = binarySearchAlgo(value, 0, peakIndex - 1, target);
        } else {
            ans = binarySearchAlgo(value, peakIndex, value.length - 1, target);
        }
        System.out.println("Running===>" + ans);
    }

    private static int findRotationPoint(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end) {

            mid = start + (end - start) / 2;
            System.out.println("Start : " + arr[start] + " End : " + arr[end] + " Mid " + arr[mid]);
            if (arr[mid] == arr[end]) {
                end--;
            } else if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[start] > arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int binarySearchAlgo(int[] numbs, int left, int right, int target) {
        if (numbs.length < 1) {
            return -1;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbs[mid] == target) {
                return mid;
            }
            if (target > numbs[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
