package com.kaushal;

import java.util.Scanner;

public class OptimizedPrime {
    public static void main(String[] args) {
        System.out.println("Please Enter a number, Negative to close the program.");
        Scanner in = new Scanner(System.in);
        int val ;
        boolean loop =  true;
        while (loop){
            val = in.nextInt();
            if (val  < 0) {
                loop = false;
            }
            boolean ans = isPrime(val);
            System.out.println("Is Prime ---- " + ans);
        }
    }

    static boolean isPrime(int num){
        if (num < 2) {
            return false;
        }
        int count = 2;
        while ( count * count <= num){
            if(num % count == 0){
                return false;
            }
            count++;
        }
        return true;
    }
}
