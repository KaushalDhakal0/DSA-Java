package com.kaushal.TwoDArrays;

//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.
public class TwoDArr {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 5;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target){
                    System.out.println("ATarget Found at Index i : " + i + " j = " + j + " Value = " + matrix[i][j] );
                    return;
                }else {
                    System.out.println("Target Not Fund");
                }
            }
        }

    }
}
