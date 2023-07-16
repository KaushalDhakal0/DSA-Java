package com.kaushal.RandomQuestions;

import java.util.Scanner;

// abc is Armstrong if abc = a^2 + b^3 + c^3

public class Armstrong {
    public static void main(String[] args) {
//        System.out.println("Please Enter a number");
//        boolean ans = isArmstrong();
        System.out.println("Armstrong Numbers are ===>");
        for (int i = 10; i < 1000; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n){
//        Scanner in = new Scanner(System.in);
//        int original = in.nextInt();
        int num = n;
        int ans = 0;
        while (num > 0){
            int rem = num%10;
            num/= 10;
            ans = ans + rem*rem*rem;
        }
        return ans == n;
    }
}
