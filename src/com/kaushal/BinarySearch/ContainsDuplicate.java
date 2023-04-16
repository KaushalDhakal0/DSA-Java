package com.kaushal.BinarySearch;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 4,5, 6, 7, 7, 8, 9};
        int target = 4;
        boolean ans = containsDuplicate(nums,target);
        System.out.println("Ans ==== " + ans);

    }

    private static boolean containsDuplicate(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid;
        while (start <= end){
            mid = start + (end - start)/2;
            if (arr[mid] == target){
                System.out.println("Here " + mid + " ");
                if ((mid < arr.length - 1 && arr[mid] == arr[mid + 1]  ) || (mid > 0 && arr[mid] == arr[mid -1] )){
                    return true;
                }else {
                    return false;
                }
            }else if(arr[mid] > target){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return false;
    }
}
