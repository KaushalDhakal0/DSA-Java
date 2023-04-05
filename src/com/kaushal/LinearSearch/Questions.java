package com.kaushal.LinearSearch;




//Input: nums = [12,345,2,6,7896]
//        Output: 2
//        Explanation:
//        12 contains 2 digits (even number of digits).
//        345 contains 3 digits (odd number of digits).
//        2 contains 1 digit (odd number of digits).
//        6 contains 1 digit (odd number of digits).
//        7896 contains 4 digits (even number of digits).
//        Therefore only 12 and 7896 contain an even number of digits.
public class Questions {
    public static void main(String[] args) {
       int[] nums = {12,345,2,6345,7896,23,43,4};
       int ans = findAns(nums);
        System.out.println("Ans == " + ans);

        //Second Approach
        int finalCount = 0 ;
        for (int i = 0; i < nums.length; i++) {
            int length = count(nums[i]);
            if (isEven(length)){
                finalCount ++ ;
            }
        }
        System.out.println("final Ans = " + finalCount);
    }
    private static boolean isEven(int num){
        return num % 2 == 0;
    }

    private static int findAns(int[] numsz) {
        //If ans can be found without converting data types, it is better to not convert data type.
        if (numsz.length == 0 ){
            return -1;
        }
        int count = 0;
        for (int i = 0; i < numsz.length; i++) {
            String val = String.valueOf(numsz[i]);
            if(val.length() % 2 == 0 && val.length() >= 2){
                System.out.println("====" + val);
                System.out.println("===i==" + i);
                count ++;
            }

        }
        return count;
    }

    private static int count(int ans){
        int count = 0;
        while (ans > 0){
            count ++;
            ans /= 10;
        }
        return count;
    }
}
