package com.kaushal.inheritance;

public class BoxWithWeight extends Box {
    double weight;
    BoxWithWeight(double l , double w, double h, double weight){
        super(l,w,h);
        System.out.println("BOX with Weight constructor");
        this.weight = weight;
    }

    BoxWithWeight(Box box, double weight){
        super(box);
        this.weight = weight;
    }
}
