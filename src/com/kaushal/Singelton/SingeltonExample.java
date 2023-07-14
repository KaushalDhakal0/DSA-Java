package com.kaushal.Singelton;

public class SingeltonExample {

     private static SingeltonExample instance;
     private SingeltonExample(){

     }
     public static SingeltonExample getInstance(){
        if(instance == null){
           synchronized (SingeltonExample.class){
              if (instance == null){
                 instance = new SingeltonExample();
              }
           }
        }
        return instance;
     }
}
