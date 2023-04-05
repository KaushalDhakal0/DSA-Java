package com.kaushal.LinearSearch;

//Input: accounts = [[1,5],[7,3],[3,5]]
//        Output: 10
//        Explanation:
//        1st customer has wealth = 6
//        2nd customer has wealth = 10
//        3rd customer has wealth = 8
//        The 2nd customer is the richest with a wealth of 10.

public class RichestWealth {
    public static void main(String[] args) {
        int [][] accounts = {
            {1,2},
            {7,3},
            {3,5}
        };

        int ans = findRichest(accounts);
        System.out.println("Richest = " + ans);
        //Calculates length of Integer
        int numCount = (int)Math.log10(12345) + 1;
        System.out.println("HEllo ======>" + numCount);
    }
    static int findRichest(int[][] val){
        int sum = 0;
        for (int i = 0; i < val.length; i++) {
            int temp = 0;
            for (int j = 0; j < val[i].length; j++) {
                temp += val[i][j];
            }
//            if (sum < temp){
//                sum = temp;
//            }
            sum = Math.max(temp,sum);

        }
        return sum;
    }
}
