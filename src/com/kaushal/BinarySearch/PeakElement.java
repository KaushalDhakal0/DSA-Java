package com.kaushal.BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,108,8,7,6,5,4,3,2,1,0};
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start = (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
                //Descending chunk
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        System.out .print("ANs = " + start +" Value = " + arr[start]);
//        return start;
    }
}
