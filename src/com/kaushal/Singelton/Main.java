package com.kaushal.Singelton;

public class Main {
    public static void main(String[] args) {
        Singelton objOne =  Singelton.getInstance();
        Singelton objTwo =  Singelton.getInstance();

        boolean areSame = objOne == objTwo;
        System.out.println("==ARE SINGELTON===>>>>" + areSame);
    }
}
