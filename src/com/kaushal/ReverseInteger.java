package com.kaushal;


import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner numbs = new Scanner(System.in);
        System.out.println("Please enter Number to reverse");
        int num = numbs.nextInt();
        int ans = 0 ;
        while (num > 0){
            int rem = num % 10;
            num /= 10;
            ans =  ans * 10 + rem;
        }
        System.out.println("==REVERSED NUMBER===" + ans);

//        System.out.println();

    }
}
