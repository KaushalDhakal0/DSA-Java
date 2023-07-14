package com.kaushal.StaticExample;

public class StaticExample {

    public static void main(String[] args) {
        greetMe();


        //Calling non Static properties and method from static context.
        StaticExample reference = new StaticExample();
        reference.roar();
    }

     private static void greetMe() {
         System.out.println("Greet me!!!");
         StaticExample reference = new StaticExample();
         reference.roar();
    }
     private void roar(){
        System.out.println("Roar");
//        greetMe();
        speak();

    }

    static void speak(){
        System.out.println("Speaking");
    }
}
