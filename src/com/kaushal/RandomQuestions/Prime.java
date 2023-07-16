package com.kaushal.RandomQuestions;

public class Prime {
    static boolean isPrime( int num){
        boolean ans = true;
        if (num <= 2){
            return true;
        }
        for (int i = 2 ; i< num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return ans;
    }
     public static void main(String[] args){
        int num = 989;

        System.out.println("IS PRIME =re---- "+  isPrime(num)  );
    }

}
