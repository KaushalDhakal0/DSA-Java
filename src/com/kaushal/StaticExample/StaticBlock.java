package com.kaushal.StaticExample;

public class StaticBlock {
    static int a = 20;
    static int b;

    static {
        System.out.println("Inside Static Block.");
        b = 200;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        obj.a += 99;
        StaticBlock hello = new StaticBlock();
        System.out.println("A == " + hello.a + " B== " + obj.b);
    }
}
