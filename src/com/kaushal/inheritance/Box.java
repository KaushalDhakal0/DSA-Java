package com.kaushal.inheritance;

public class Box {
    double length;
    double width;
    double height;

    Box(){

        this.length = -1;
        this.width = -1;
        this.height = -1;
    }
    Box(double l, double w , double h){
        System.out.println("Box constructor");
        this.length = l;
        this.width = w;
        this.height = h;
    }
    Box(Box box){
        this.length = box.length ;
        this.width = box.width ;
        this.height = box.height ;
    }

}
