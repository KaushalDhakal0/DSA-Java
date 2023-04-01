package com.kaushal;
//LINK => https://leetcode.com/problems/remove-element/
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//
//        Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//
//        Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//        Return k.

public class Functions {
    public static void main(String[] args) {
        int [] x  = {3,2,2,3,4,5,6,7,8,90,1,2,3,4,5,6,7,8};
        int k = 3;
        int ans  =  removeElement(x,k);
        System.out.println("====ANS=====" + ans);
    }
    static int  removeElement(int [] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    }

