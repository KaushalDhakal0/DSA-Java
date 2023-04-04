package com.kaushal.Arrays;

public class Loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("For Loop " + i);
        }

// while loop
        int j = 0;
        while (j < 10) {
            System.out.println("while loop  " + j);
            j++;
        }

// do-while loop
        int k = 0;
        do {
            System.out.println("Do While " + k);
            k++;
        } while (k < 10);

// foreach loop
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("For Each " +number);
        }

    }
}
