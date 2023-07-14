package com.kaushal.Singelton;

public class Main {
    public static void main(String[] args) {
        SingeltonExample objOne =  SingeltonExample.getInstance();
        SingeltonExample objTwo =  SingeltonExample.getInstance();

        boolean areSame = objOne == objTwo;
        System.out.println("==ARE SINGELTON===>>>>" + areSame);
    }
}
