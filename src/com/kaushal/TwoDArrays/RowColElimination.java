package com.kaushal.TwoDArrays;

import java.util.Arrays;


//Time Complexity : O(m + n). where,
// m =  length of rows/matrix
//n = no of columns of matrix.
public class RowColElimination {
    public static void main(String[] args) {
        int[][] matrix  = new int[6][6];
        int sum = 376;
        //Creating 2D array which is sorted both Row Wise and Column Wise.
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                sum+=10;
                matrix[i][j] = 1+1 * j+1 + sum ;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        int target = 743;
        int[] ans = findTarget(matrix,target);
        System.out.println("Answer :::::::" + Arrays.toString(ans));
    }

    private static int[] findTarget(int[][] matrix, int target) {

        int i = 0;
        int j = matrix.length - 1;
        while (i < matrix.length && j >=0 ){
            if(matrix[i][j] == target){
                return new int[]{i,j};
            } else if (matrix[i][j] > target) {
                j --;
            }else {
                i ++;
            }
        }
        return new int[]{-1,-1};
    }

}
