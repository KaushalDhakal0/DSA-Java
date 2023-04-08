package com.kaushal.BinarySearch;


public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target = 10;
        int answer = findAnsBinarySearch(arr,target);
        System.out.println("Answer Found index == " + answer );
    }

    private static int findAnsBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int temp;
        while (arr[end] <= target){
            temp = end;
            end = end + (end - start + 1)* 2;
            start = temp;
        }
        while (start <= end){
            int mid = start + (end -start)/2;
            if(arr[mid] > target ){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
        }
}
