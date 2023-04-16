package com.kaushal.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        //int[] arr = { 6,7,8,9,10,10,10,10,1,1, 1, 2, 3, 4,4,4,4,4};
        int[] arr = {18,18, 18, 18,  18, 18, 18, 18, 18, 18,5};
        int pivot = findPivot(arr);
        System.out.println("Number Of Rotation[Rotation Index]: " + pivot + "  =Rotation point Value== " + arr[pivot]);
    }

    private static int findPivot(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        int count = 0;
        while (left <= right) {
            count++;
            System.out.println("Count : " + count);
            mid = left + (right - left) / 2;
            //System.out.println("Left value = " + arr[left] + "Right = " + arr[right] + "Mid = " + arr[mid]);
            if (arr[left] == arr[right]) {
                right--;
            }else if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            } else if (arr[left] > arr[mid]) {
                right = mid;
            } else {
                //If mid was the answer it would have been caught in first check. arr[mid] > arr[mid + 1]
                left = mid + 1;
            }
        }
        //means not rotated.
        return 0;
    }
}
