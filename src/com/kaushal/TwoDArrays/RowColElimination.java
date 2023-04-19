package com.kaushal.TwoDArrays;

import java.util.Arrays;

public class RowColElimination {
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
        int target = 3887;
        int[] ans = findTarget(matrix,target);
        System.out.println("Answer :::::::" + Arrays.toString(ans));
    }

    private static int[] findTarget(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        int i = 0;
        int j = column - 1;
        while (i < row && j >=0 ){
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
