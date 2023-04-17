package com.kaushal.BinarySearch;


//Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
//In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
//Note that 0 is neither positive nor negative.
public class MaxCountPosNeg {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        int pos = 0;
        int neg = 0;
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] > 0){
                    pos += 1;
                }else if(nums[i] < 0){
                    neg += 1;
                }
            }
        System.out.print("Ans = " + Math.max(pos,neg) + " ");
//        return Math.max(pos,neg);
    }
}
