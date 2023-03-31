package com.kaushal;

public class Fibo {
    public static void main(String [] args){
        int nums = 10;
        int i = 0 ;
        int j = 1 ;
        int count = 2;
        System.out.println("======" + i);
        System.out.println("======" + j);
        while(count < nums){
            int temp = j;
            j = i + j;
            i = temp;
            count++ ;
            System.out.println("======" + j  + "Count : " + count);

        }

    }
}
