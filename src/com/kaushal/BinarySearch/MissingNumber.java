package com.kaushal.BinarySearch;
//Input: nums = [9,6,4,2,3,5,7,0,1]
// Output: 8
//Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int n = nums.length ;
        int sum = (n*(n+1))/2;
        int temp = 0;
        for(int i = 0 ; i < n  ; i++){
            temp +=nums[i];
        }
        System.out.println("Sum = " + sum + "Temp " + temp);
//        return sum - temp;
    }

}
