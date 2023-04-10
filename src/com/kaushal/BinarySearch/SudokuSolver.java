package com.kaushal.BinarySearch;

public class SudokuSolver {
    private static final int N = 9; // Size of the Sudoku board
    private int[][] board; // Sudoku board

    public SudokuSolver(int[][] board) {
        this.board = board;
    }

    // Main solver method
    public boolean solve() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (board[row][col] == 0) { // If cell is empty
                    for (int num = 1; num <= N; num++) {
                        if (isSafe(row, col, num)) {
                            board[row][col] = num; // Try placing number in cell

                            if (solve()) {
                                return true; // If successful, return true
                            } else {
                                board[row][col] = 0; // Otherwise, backtrack
                            }
                        }
                    }
                    return false; // If no number can be placed, return false
                }
            }
        }
        return true; // If all cells are filled, return true
    }

    // Helper method to check if a number can be placed in a cell
    private boolean isSafe(int row, int col, int num) {
        // Check if number is already present in row, column, or 3x3 grid
        return !isPresentInRow(row, num) &&
                !isPresentInCol(col, num) &&
                !isPresentInBox(row - row % 3, col - col % 3, num);
    }

    // Helper method to check if a number is present in a row
    private boolean isPresentInRow(int row, int num) {
        for (int col = 0; col < N; col++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    // Helper method to check if a number is present in a column
    private boolean isPresentInCol(int col, int num) {
        for (int row = 0; row < N; row++) {
            if (board[row][col] == num) {
                return true;
            }
        }
        return false;
    }

    // Helper method to check if a number is present in a 3x3 box
    private boolean isPresentInBox(int startRow, int startCol, int num) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row + startRow][col + startCol] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    // Helper method to print the Sudoku board
    public void printBoard() {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] board = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

        SudokuSolver solver = new SudokuSolver(board);

        System.out.println("Sudoku board before solving:");
        solver.printBoard();

        if (solver.solve()) {
            System.out.println("\nSudoku board after solving:");
            solver.printBoard();
        } else {
            System.out.println("No solution exists for the given Sudoku board.");
        }
    }}



