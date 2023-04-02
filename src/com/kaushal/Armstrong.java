package com.kaushal;

import java.util.Scanner;

// abc is Armstrong if abc = a^2 + b^3 + c^3

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Please Enter a number");
        boolean ans = isArmstrong();
        System.out.println("ANS ===>" + ans);
    }
    static boolean isArmstrong(){
        Scanner in = new Scanner(System.in);
        int original = in.nextInt();
        int num = original;
        int ans = 0;
        while (num > 0){
            int rem = num%10;
            num/= 10;
            ans = ans + rem*rem*rem;
        }
        return ans == original;
    }
}
