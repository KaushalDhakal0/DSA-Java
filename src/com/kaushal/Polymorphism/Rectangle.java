package com.kaushal.Polymorphism;

 public class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }
    @Override
    void calculateArea(){
        System.out.println("Area of rectangle : " + (this.length * this.width));
    }
}
