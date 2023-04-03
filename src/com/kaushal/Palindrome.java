package com.kaushal;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println("Please Enter a number to check if it is palindrome");
//        Scanner input = new Scanner(System.in);
        System.out.println("All Palindrome numbers in given range");
        for (int i = 0; i < 1000; i++) {
            if (isPalindrome(i)){
                System.out.println(i);
            }
        }
//        int ans = input.nextInt();
//        System.out.println("ANS ==" + isPalindrome(ans));

    }
    static boolean isPalindrome(int n){
        int original = n;
        int rem = 0;
        int answer = 0;
        while(n> 0){
            rem = n % 10;
            n = n / 10;
            answer = answer * 10 + rem;
        }
        return answer == original ? true : false;
    }
}
