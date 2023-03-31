package com.kaushal;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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
    public static void main(String[] args) {
        Scanner dta =  new Scanner(System.in);
        System.out.println("Enter a number to check if Prime:=");
        int inputNum =  dta.nextInt();
        System.out.println("IS PRIME =" + isPrime(inputNum));
    }
}