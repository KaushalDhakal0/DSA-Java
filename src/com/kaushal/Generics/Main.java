package com.kaushal.Generics;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomArrayList numbers = new CustomArrayList();
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(11);
        numbers.add(12);
        numbers.add(909);
        System.out.println("=====" + Arrays.toString(numbers.getData()) );
        System.out.println("=====" + numbers.getSize() );


    }
}
