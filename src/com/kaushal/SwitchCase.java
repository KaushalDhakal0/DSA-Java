package com.kaushal;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1 -> System.out.println("=====>" + a);
            case 2 -> System.out.println("=====2=>" + a);
            default -> System.out.println("=====DEFAULT");
        }
    }
}
