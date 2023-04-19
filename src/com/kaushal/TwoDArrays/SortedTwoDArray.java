package com.kaushal.TwoDArrays;

import java.util.Arrays;

public class SortedTwoDArray {
    public static void main(String[] args) {
        int[][] matrix  = new int[6][6];
        int sum = 20;
        //Creating 2D array which is sorted both Row Wise and Column Wise.
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                sum+=10;
                matrix[i][j] = 1+1 * j+1 + sum ;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        int target = 365;
        int ans = findTarget(matrix,target);
        System.out.println("Answer :::::::" + ans);
    }

    private static int findTarget(int[][] matrix, int target) {
        int rows = matrix.length - 1;
        int column = matrix[0].length;
        int mid;
        int counter = 0;
        for (int i = 0; i <= matrix.length - 1; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while ( left <= right ){
                mid = left + (right - left)/2;
                // System.out.println("Number of Iterations required:" + i + "Mid : " + mid );
                if (matrix[i][mid] ==  target){
                    return matrix[i][mid];
                }else if(target > matrix[i][mid]){
                    left =  mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;

    }
}
