package com.kaushal;


import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
//        Scanner numbs = new Scanner(System.in);
//        System.out.println("Please enter Number to reverse");
//        int num = numbs.nextInt();
        long num = 1534236469;
        long ans = 0 ;
        while (num > 0){
            long rem = num % 10;
            num /= 10;
            ans =  ans * 10 + rem;
        }
        System.out.println("==REVERSED NUMBER===" + ans);

        System.out.println(Integer.MAX_VALUE + "===" + Integer.MIN_VALUE);


    }
}
